package se.iths.sofia.springbootproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.sofia.springbootproj.model.Product;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {

    @GetMapping("/products")
    public String getProducts(Model model) {
        List<Product> products = List.of(
                new Product(1, "Basketboll", 199, "Sport"),
                new Product(2, "Mascara", 100, "Smink"),
                new Product(3, "Fotboll", 150, "Sport")
        );
        model.addAttribute("products", products);
        return "products";

    }

}
