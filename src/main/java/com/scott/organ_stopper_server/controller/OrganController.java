package com.scott.organ_stopper_server.controller;

import com.scott.organ_stopper_server.model.Organ;
import com.scott.organ_stopper_server.service.OrganService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganController {
    private final OrganService organService;

    OrganController(OrganService organService) {
        this.organService = organService;
    }

    @GetMapping("/")
    public ResponseEntity<String> getGreeting() {
        return ResponseEntity.ok("Hola!");
    }

    @GetMapping("/organ/{id}")
    public ResponseEntity<Organ> getOrganById(@PathVariable Integer id) {
        return ResponseEntity.ok(organService.getOrganById(id));
    }
}
