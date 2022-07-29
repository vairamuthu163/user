package com.example.user.service;

import com.example.user.document.User;

public interface UserService {
    User save(User user);
    User findById(int id);
}
