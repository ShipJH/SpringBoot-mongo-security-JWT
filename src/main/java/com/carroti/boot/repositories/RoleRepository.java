package com.carroti.boot.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carroti.boot.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
