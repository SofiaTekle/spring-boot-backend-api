package se.iths.sofia.springbootproj.dto;

import lombok.Data;

@Data
public class ProductUpdateDto {

    private String name;
    private Double price;
    private String description;

}
