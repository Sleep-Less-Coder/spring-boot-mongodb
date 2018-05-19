package com.hemant.mongodb.springboot.mongodemo.config;

import com.hemant.mongodb.springboot.mongodemo.document.User;
import com.hemant.mongodb.springboot.mongodemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
//        userRepository.deleteAll();
        return args -> {

            userRepository.save(new User(1, "Hemant", "Development", 120000L));
            userRepository.save(new User(2, "Deepak", "Operations", 130000L));
            userRepository.save(new User(3, "Subash", "Marketing", 20000L));
            userRepository.save(new User(4, "Travis", "Finance", 90000L));
            userRepository.save(new User(5, "Scott", "Engineering", 1000L));

        };
    }
}
