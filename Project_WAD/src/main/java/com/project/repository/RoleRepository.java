package com.project.repository;

import java.util.Optional;

import com.project.models.ERole;
import com.project.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}