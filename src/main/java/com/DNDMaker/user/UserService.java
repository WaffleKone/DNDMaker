package com.DNDMaker.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String hashPassword(String password) {
        SCryptPasswordEncoder encoder = new SCryptPasswordEncoder(16384, 8, 4, 32, 64);

        String encodedPassword = encoder.encode(password);
        System.out.println(encodedPassword);

        Boolean isValidPassword = encoder.matches(password, encodedPassword);
        System.out.println(isValidPassword);

        return encodedPassword;
    }

    public User registerAccount(User user) {
        try {
           UserRegisterDto userRegisterDto = new UserRegisterDto(user.getUserId(), user.getUsername(), hashPassword(user.getPassword()));
           User savedUser = new User(userRegisterDto.getUserId(), userRegisterDto.getUsername(), userRegisterDto.getPassword());

           return userRepository.save(savedUser);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public User loginAccount(User user) {
//
//    }
//    public User updatePassword(Long id, String oldPassword, String newPassword) {
//        String hashedOldPassword = hashPassword(oldPassword);
//        Optional<User> user = findUserById(id);
//        user.
//        if (user.getPassword())
//
//        UserRegisterDto userRegisterDto = new UserRegisterDto(user.getUserId(), user.getUsername(), hashPassword(user));
//        User savedUser = new User(userRegisterDto.getUserId(), userRegisterDto.getUsername(), userRegisterDto.getPassword());
//        return userRepository.save(savedUser);
//    }
    public List<UserPublicInfoDto> listAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserPublicInfoDto> userPublicInfoDtos = new ArrayList<>();

        users.forEach(user -> {
            UserPublicInfoDto userPublicInfoDto = new UserPublicInfoDto(user.getUsername(), user.getUserId());
            userPublicInfoDtos.add(userPublicInfoDto);
        });

        return userPublicInfoDtos;
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }


}
