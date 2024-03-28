package com.example.demo.model.mapper;

import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user) {
        return new UserDto(user.getId(), user.getName(), user.getEmail(), user.getPhone(), user.getAvatar());
    }
}
