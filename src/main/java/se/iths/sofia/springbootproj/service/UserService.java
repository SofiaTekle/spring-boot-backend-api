package se.iths.sofia.springbootproj.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.iths.sofia.springbootproj.model.User;
import se.iths.sofia.springbootproj.repo.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
