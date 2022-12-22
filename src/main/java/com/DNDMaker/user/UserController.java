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

    @GetMapping(value = "/user/list", produces = "application/json")
    public ResponseEntity<List<UserPublicInfoDto>> listAllUsers() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.listAllUsers());

    }
    @GetMapping(value = "/user",produces = "application/json")
    public ResponseEntity<Optional<User>> findUserById(@RequestParam Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findUserById(id));
    }

    @GetMapping(value = "/user/login",produces = "application/json")
    public ResponseEntity<Boolean> loginAccount(@RequestParam String username, String password) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.checkValidPassword(username, password));
    }

    @PutMapping(value = "/user/changePassword",produces = "application/json")
    public ResponseEntity<UserPublicInfoDto> changePassword(@RequestParam String username, String oldPassword, String newPassword) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.changePassword(username, oldPassword, newPassword));
    }

    @DeleteMapping(value="/user/deleteAccount", produces = "application/json")
    public ResponseEntity<Boolean> deleteAccount(@RequestParam String username, String password){
        return ResponseEntity.status(HttpStatus.OK).body(userService.deleteAccount(username, password));
    }

}

