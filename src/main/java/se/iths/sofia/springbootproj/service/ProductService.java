package se.iths.sofia.springbootproj.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import se.iths.sofia.springbootproj.dto.ProductCreateDto;
import se.iths.sofia.springbootproj.dto.ProductResponseDto;
import se.iths.sofia.springbootproj.dto.ProductUpdateDto;
import se.iths.sofia.springbootproj.model.Product;
import se.iths.sofia.springbootproj.model.User;
import se.iths.sofia.springbootproj.repo.ProductRepository;
import se.iths.sofia.springbootproj.repo.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public List<ProductResponseDto> getProducts() {
        return productRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    public ProductResponseDto getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("Product with id " + id + " not found"));
        return toDto(product);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new EntityNotFoundException("Product with id " + id + " not found");
        }
        productRepository.deleteById(id);
    }

    private ProductResponseDto toDto(Product product) {
        return new ProductResponseDto(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription()
        );
    }

    private Product toEntity(ProductCreateDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());

        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() ->
                        new EntityNotFoundException(
                                "User with id " + dto.getUserId() + " not found"));

        product.setUser(user);
        return product;
    }

    public ProductResponseDto createProduct(ProductCreateDto dto) {
        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() ->
                        new EntityNotFoundException("User with id " + dto.getUserId() + " not found"));

        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        product.setUser(user);

        Product saved = productRepository.save(product);

        return toDto(saved);
    }


    public ProductResponseDto updateProduct(Long id, ProductUpdateDto dto) {
        Product product = productRepository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("Product with id " + id + " not found"));

        if (dto.getName() != null) {
            product.setName(dto.getName());
        }

        if (dto.getPrice() != null) {
            product.setPrice(dto.getPrice());
        }

        if (dto.getDescription() != null) {
            product.setDescription(dto.getDescription());
        }

        Product saved = productRepository.save(product);
        return toDto(saved);
    }


}