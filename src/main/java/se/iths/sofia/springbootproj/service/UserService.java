package se.iths.sofia.springbootproj.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import se.iths.sofia.springbootproj.dto.UserCreateDto;
import se.iths.sofia.springbootproj.dto.UserResponseDto;
import se.iths.sofia.springbootproj.dto.UserUpdateDto;
import se.iths.sofia.springbootproj.model.User;
import se.iths.sofia.springbootproj.repo.ProductRepository;
import se.iths.sofia.springbootproj.repo.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public List<UserResponseDto> getUsers() {
        return userRepository.findAll()
                .stream()
                .map(user -> new UserResponseDto(
                        user.getId(),
                        user.getUserName(),
                        user.getEmail(),
                        user.getAge()
                ))
                .toList();
    }

    public UserResponseDto createUser(UserCreateDto dto) {
        User user = new User();
        user.setUserName(dto.getUserName());
        user.setEmail(dto.getEmail());
        user.setAge(dto.getAge());

        User saved = userRepository.save(user);

        return new UserResponseDto(
                saved.getId(),
                saved.getUserName(),
                saved.getEmail(),
                saved.getAge()
        );
    }


    public UserResponseDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("User with id " + id + " not found"));

        return new UserResponseDto(
                user.getId(),
                user.getUserName(),
                user.getEmail(),
                user.getAge()
        );
    }

    public UserResponseDto updateUser(Long id, UserUpdateDto dto) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("User with id " + id + " not found"));

        if (dto.getUserName() != null) {
            user.setUserName(dto.getUserName());
        }

        if (dto.getEmail() != null) {
            user.setEmail(dto.getEmail());
        }

        if (dto.getAge() != null) {
            user.setAge(dto.getAge());
        }

        User saved = userRepository.save(user);

        return new UserResponseDto(
                saved.getId(),
                saved.getUserName(),
                saved.getEmail(),
                saved.getAge()
        );
    }

    public void deleteUser(Long userId) {

        // 1. Finns usern?
        if (!userRepository.existsById(userId)) {
            throw new EntityNotFoundException("User not found");
        }

        // 2. Har usern products?
        if (productRepository.existsByUserId(userId)) {
            throw new IllegalStateException(
                    "User cannot be deleted because it has products"
            );
        }

        // 3. OK att radera
        userRepository.deleteById(userId);
    }


}
