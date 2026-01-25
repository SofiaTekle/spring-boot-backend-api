package se.iths.sofia.springbootproj.service;

import org.springframework.stereotype.Service;
import se.iths.sofia.springbootproj.model.Product;
import se.iths.sofia.springbootproj.repo.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();

    }
}

