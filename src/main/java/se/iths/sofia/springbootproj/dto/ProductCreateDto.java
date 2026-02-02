package se.iths.sofia.springbootproj.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateDto {

    @NotBlank(message = "Name is required")
    private String name;

    @Positive(message = "Price must be greater than zero")
    private double price;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "User ID is required")
    private Long userId;
}