package com.DNDMaker.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
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

        String hashPass = (BCrypt.hashpw(password, BCrypt.gensalt(12)));


        return hashPass;
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

    public Boolean loginAccount(String username, String password) {
        User foundUser = userRepository.findByUsername(username).get();
        return BCrypt.checkpw(password, foundUser.getPassword());
    }
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
