package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.dto.UserDto;

@Service
public interface UserServiceImpl {
    public List<UserDto> getUsers();

    public UserDto getUserById(int id);

    public List<UserDto> searchUsers (String name);
}
