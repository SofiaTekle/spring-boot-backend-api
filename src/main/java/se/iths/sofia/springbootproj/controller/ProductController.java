package se.iths.sofia.springbootproj.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.iths.sofia.springbootproj.dto.ProductCreateDto;
import se.iths.sofia.springbootproj.dto.ProductResponseDto;
import se.iths.sofia.springbootproj.dto.ProductUpdateDto;
import se.iths.sofia.springbootproj.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> getAllProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDto> getProductBy(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping
    public ResponseEntity<ProductResponseDto> createProduct(
            @Valid @RequestBody ProductCreateDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(productService.createProduct(dto));
    }


    @PatchMapping("/{id}")
    public ResponseEntity<ProductResponseDto> updateProduct(
            @PathVariable Long id,
            @RequestBody ProductUpdateDto dto) {

        return ResponseEntity.ok(productService.updateProduct(id, dto));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }


}
