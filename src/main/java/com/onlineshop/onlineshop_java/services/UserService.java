package com.onlineshop.onlineshop_java.services;

import com.onlineshop.onlineshop_java.models.User;

import java.util.List;

public interface UserService {
    
    List<User> getAllUsers();

    User getUserById(int id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUserById(int id);
}
