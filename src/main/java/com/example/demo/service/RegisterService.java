package com.example.demo.service;

import com.example.demo.dto.RegisterDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.SQLException;

@Service
public class RegisterService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(RegisterDto registerDto) {
            User user = new User();
            user.setUsername(registerDto.getUsername());
            user.setEmail(registerDto.getEmail());
            user.setPassword(registerDto.getPassword());
            return userRepository.save(user);
    }

}
