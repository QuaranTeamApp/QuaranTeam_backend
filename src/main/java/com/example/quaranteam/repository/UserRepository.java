package com.example.quaranteam.repository;

import com.example.quaranteam.services.entity.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    
}
