package com.DNDMaker.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    // Log-In
    // Update Password
    // Delete Account
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Register Account

    @PostMapping(value = "/register", consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> registerAccount(@RequestBody UserRequestDto userRequestDTO) {
        User user = new User(userRequestDTO.getUsername(), userRequestDTO.getPassword());
        userService.registerAccount(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    // Get All User Info

    @GetMapping(value = "/userList", produces = "application/json")
    public ResponseEntity<List<UserPublicInfoDto>> listAllUsers() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.listAllUsers());

    }
    @GetMapping(value = "/user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Optional<User>> findUserById(@RequestBody Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findUserById(id));
    }
}

