package se.iths.sofia.springbootproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

//    private final HomeService homeService;
//
//    public HomeController(HomeService homeService) {
//        this.homeService = homeService;
//    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home");
        return "index"; // pekar på index.html
    }

}
