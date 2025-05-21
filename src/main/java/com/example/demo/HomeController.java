package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("home")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Hello, World!");
    }
}
