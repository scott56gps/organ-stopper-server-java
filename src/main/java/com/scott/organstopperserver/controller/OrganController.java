package com.scott.organstopperserver.controller;

import com.scott.organstopperserver.exception.OrganNotFoundException;
import com.scott.organstopperserver.model.entity.Organ;
import com.scott.organstopperserver.service.OrganService;
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
    public ResponseEntity<Organ> getOrganById(@PathVariable Long id) throws OrganNotFoundException {
        return ResponseEntity.ok(organService.getOrganById(id));
    }
}
