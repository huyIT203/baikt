package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public class userservice {
    @Autowired
    private userservice userRepository;

    public List<User> getAllUsers() {
        return userRepository.find();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userReposi
}
