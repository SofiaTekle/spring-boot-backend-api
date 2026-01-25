package se.iths.sofia.springbootproj.service;

import org.springframework.stereotype.Service;
import se.iths.sofia.springbootproj.model.User;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(1, "Sofia", "sofia@example.com", 30),
                new User(2, "Theo", "theo@example.com", 35),
                new User(3, "Kalle", "kalle@example.com", 25)
        );
    }
}
