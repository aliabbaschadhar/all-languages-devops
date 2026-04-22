package com.example.backend;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public Map<String, String> greeting() {
        String greeting = System.getenv("GREETING");
        if (greeting == null || greeting.isBlank()) {
            greeting = "Hello, World!";
        }
        return Map.of("message", greeting);
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "ok");
    }
}