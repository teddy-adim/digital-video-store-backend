package com.digitalvideostore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.digitalvideostore.repository")
public class DigitalVideoStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(DigitalVideoStoreApplication.class, args);
    }
}
