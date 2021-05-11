package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/greet")
    String home() {
        return "Hello, Memosha welcome to our planet Earth!!!";
    }
}
