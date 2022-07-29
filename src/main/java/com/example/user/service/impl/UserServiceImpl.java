package com.example.user.service.impl;

import com.example.user.document.User;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
    @Override
    public User findById(int id) {
        return mongoTemplate.findById(id,User.class);
    }


}
