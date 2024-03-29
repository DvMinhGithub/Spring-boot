package com.example.demo.repository;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.example.demo.model.State;
import com.example.demo.model.User;

@Repository
public class UserRepo {
    private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<String, User>();

    public User addUser(String fullName, String email, String hashed_password) {
        return addUser(fullName, email, hashed_password, State.PENDING);
    }

    public User addUser(String fullName, String email, String hashed_password, State state) {
        String id = UUID.randomUUID().toString();
        User user = new User(id, email, fullName, hashed_password, state);
        users.put(id, user);
        return user;
    }
}
