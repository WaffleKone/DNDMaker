package com.DNDMaker.user;

import com.DNDMaker.exceptions.InvalidLoginException;
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

    public Boolean checkValidPassword(String username, String password) {
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

    public UserPublicInfoDto changePassword(String username, String oldPassword, String newPassword) {
        if (checkValidPassword(username, oldPassword)) {
            User foundUser = userRepository.findByUsername(username).get();
            foundUser.setPassword(hashPassword(newPassword));
            userRepository.save(foundUser);
            return new UserPublicInfoDto(foundUser.getUsername(), foundUser.getUserId());
        } else {
            throw new InvalidLoginException();
        }
    }

    public Boolean deleteAccount(String username, String password) {
        if(checkValidPassword(username, password)) {
            User foundUser = userRepository.findByUsername(username).get();
            userRepository.delete(foundUser);
            return true;
        } else {
            throw new IllegalArgumentException("Invalid Username or Password");
        }

    }
}
