package se.iths.sofia.springbootproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.sofia.springbootproj.model.User;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = List.of(
                new User(1, "Sofia", "sofia@example.com", 30),
                new User(2, "Theo", "theo@example.com", 35),
                new User(3, "Kalle", "kalle@example.com", 25)
        );

        model.addAttribute("users", users);
        return "users";
    }
}
