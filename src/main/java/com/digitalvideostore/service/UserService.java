package com.digitalvideostore.service;

import com.digitalvideostore.model.User;
import com.digitalvideostore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository userRepo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public Optional<User> findById(String id) {
        return userRepo.findById(id);
    }

    public boolean login(String email, String rawPassword) {
        return userRepo.findByEmail(email)
            .map(user -> encoder.matches(rawPassword, user.getPassword()))
            .orElse(false);
    }
}
