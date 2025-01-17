package com.example.registration_backend.controller;

import com.example.registration_backend.model.User;
import com.example.registration_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> newUser(@RequestBody User user){
        return new ResponseEntity<>(userService.newUser(user),HttpStatus.CREATED );
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> userList(){
        return new ResponseEntity<>(userService.userList(),HttpStatus.OK);
    }

}
