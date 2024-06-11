package com.scott.organ_stopper_server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganController {

    @GetMapping("/")
    public ResponseEntity<String> getGreeting() {
        return ResponseEntity.ok("Hola!");
    }
}
