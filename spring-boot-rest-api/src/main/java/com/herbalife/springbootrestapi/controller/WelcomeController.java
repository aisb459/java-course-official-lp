package com.herbalife.springbootrestapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Value("${welcome}")
    private String welcome;
    @GetMapping("/hello")
    public String hello() {
        return "hello "+welcome;
    }

    @GetMapping("/hello/{name}")
    public String greet(@PathVariable("name") String name) {
        return "Hi " + name;

    }

}
