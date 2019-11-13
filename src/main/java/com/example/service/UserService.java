package com.example.service;


import com.example.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(Long userId);

    User findByUsername(String username);

    User findByID(Long id);

    List<User> findAllUsers();

    Long numberOfUsers();
}
