package com.hemant.mongodb.springboot.mongodemo.resource;

import com.hemant.mongodb.springboot.mongodemo.document.User;
import com.hemant.mongodb.springboot.mongodemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }
}
