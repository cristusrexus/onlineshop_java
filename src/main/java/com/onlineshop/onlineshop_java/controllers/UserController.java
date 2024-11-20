package com.onlineshop.onlineshop_java.controllers;

import com.onlineshop.onlineshop_java.services.UserService;

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
