package se.iths.sofia.springbootproj.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.iths.sofia.springbootproj.dto.UserCreateDto;
import se.iths.sofia.springbootproj.dto.UserResponseDto;
import se.iths.sofia.springbootproj.dto.UserUpdateDto;
import se.iths.sofia.springbootproj.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(
            @Valid @RequestBody UserCreateDto dto) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.createUser(dto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UserResponseDto> updateUser(
            @PathVariable Long id,
            @RequestBody UserUpdateDto dto) {

        return ResponseEntity.ok(userService.updateUser(id, dto));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}
