package com.carroti.boot.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carroti.boot.models.User;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}