package se.iths.sofia.springbootproj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.iths.sofia.springbootproj.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
