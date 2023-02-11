package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    private final String name = "Pietro";

    @GetMapping
    public String getName() {
        return name;
    }

    @PostMapping("/reverse")
    public String reverseName() {
        return new StringBuilder(name).reverse().toString();
    }

}