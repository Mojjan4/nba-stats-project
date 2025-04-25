package com.example.nba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NbaTestController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "API is working!";
    }
}
