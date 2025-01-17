package com.example.registration_backend.service;

import com.example.registration_backend.model.User;
import com.example.registration_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User newUser(User user) {

        return userRepository.save(user);
    }

    public List<User> userList(){
        return userRepository.findAll();
    }
}
