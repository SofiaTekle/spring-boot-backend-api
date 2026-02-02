package se.iths.sofia.springbootproj.dto;

import lombok.Data;

@Data
public class UserUpdateDto {
    private String userName;
    private String email;
    private Integer age;
}
