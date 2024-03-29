package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.example.demo.model.State;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

public class TestUserRepo {
    @Test
    public void addUser ()
    {
        UserRepo userRepo = new UserRepo();
        User user = userRepo.addUser("John", "john@gmail.com", "1234", State.PENDING);
        assertThat(user).isNotNull();
        assertThat(user.getId()).isNotNull();
    }
}
