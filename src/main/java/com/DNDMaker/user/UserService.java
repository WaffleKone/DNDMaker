package com.DNDMaker.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerAccount(User user) {
        try {
           return userRepository.save(user);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
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
}
