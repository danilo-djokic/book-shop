package com.example.bookshop.service;

import com.example.bookshop.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findUserByUsername(String username);

    void makeAdmin(String username);
}
