package se.iths.sofia.springbootproj.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateDto {
    @NotBlank(message = "Username is required")
    String userName;

    @Email(message = "Email must be valid")
    @NotBlank(message = "Email is required")
    String email;

    @Positive(message = "Age must be greater than 0")
    int age;
}
