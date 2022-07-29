package com.example.user.repository;

import com.example.user.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {
    User save(User user);
    User findById(int id);
}
