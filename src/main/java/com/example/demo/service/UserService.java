package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.model.mapper.UserMapper;


@Component
public class UserService implements UserServiceImpl {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "John", "j@j.com", "123456789", "avatar1.png", "password"));
        users.add(new User(2, "Jane", "j@j.com", "123456789", "avatar2.png", "password"));
        users.add(new User(3, "Jack", "j@j.com", "123456789", "avatar3.png", "password"));
        users.add(new User(4, "Jill", "j@j.com", "123456789", "avatar4.png", "password"));
        users.add(new User(5, "Jay", "j@j.com", "123456789", "avatar5.png", "password"));
    }

    @Override
    public List<UserDto> getUsers() {
        List<UserDto> result = new ArrayList<>();
        for (User user : users) {
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return UserMapper.toUserDto(user);
            }
        }
        return null;
    }

    @Override
    public List<UserDto> searchUsers(String name) {
        List<UserDto> result = new ArrayList<>();
        name = name.toLowerCase();
        for (User user : users) {
            if ( user.getName().toLowerCase().contains(name)) {
                result.add(UserMapper.toUserDto(user));
            }
        }
        return result;
    }
}
