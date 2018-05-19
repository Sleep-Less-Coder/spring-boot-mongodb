package com.hemant.mongodb.springboot.mongodemo.repository;

import com.hemant.mongodb.springboot.mongodemo.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer>{
}
