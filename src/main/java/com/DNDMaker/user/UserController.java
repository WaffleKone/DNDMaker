package com.DNDMaker.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    // Register Account
    // Log-In
    // Update Password
    // Delete Account
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value="/register", consumes="application/json", produces="application/json")
    public ResponseEntity<User> registerAccount(@RequestBody UserRequestDTO userRequestDTO) {
        User user = new User(userRequestDTO.getUsername(), userRequestDTO.getPassword());
        userService.registerAccount(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping(value="/userlist", produces="application/json")
    public ResponseEntity<List<UserPublicInfoDto>> listAllUsers() {

       return ResponseEntity.status(HttpStatus.OK).body(userService.listAllUsers());

    }
}
