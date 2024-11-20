package com.onlineshop.onlineshop_java.services.impl;

import com.onlineshop.onlineshop_java.models.User;
import com.onlineshop.onlineshop_java.repositories.UserRepository;
import com.onlineshop.onlineshop_java.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserSeviceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        userRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("User Not Found");
                }
        );
        return userRepository.findById(id).get();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}
