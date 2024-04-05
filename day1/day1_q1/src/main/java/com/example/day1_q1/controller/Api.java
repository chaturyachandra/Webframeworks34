package com.example.day1_q1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @GetMapping("/welcome")
    public String Greeting()
    {
        return "Welcome Spring Boot!";
    }
}
