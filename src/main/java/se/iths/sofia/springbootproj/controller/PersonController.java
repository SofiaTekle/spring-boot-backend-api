package se.iths.sofia.springbootproj.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.sofia.springbootproj.model.Person;

import java.util.List;

@Controller
@RequestMapping("/")
public class PersonController {

    @GetMapping("/persons")
    public String getPersons(Model model) {
        List<Person> persons = List.of(
                new Person(1, "John", 31, "john@example.com"),
                new Person(2, "Jane", 23, "jane@example.com"),
                new Person(3, "Sara", 33, "sara@example.com")
        );
        model.addAttribute("persons", persons);
        return "persons";
    }
}
