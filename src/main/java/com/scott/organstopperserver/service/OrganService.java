package com.scott.organstopperserver.service;

import com.scott.organstopperserver.datarepository.OrganRepository;
import com.scott.organstopperserver.exception.OrganNotFoundException;
import com.scott.organstopperserver.model.entity.Organ;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrganService {
    private final OrganRepository organRepository;

    public OrganService(OrganRepository organRepository) {
        this.organRepository = organRepository;
    }

    public Organ getOrganById(Long id) throws OrganNotFoundException {
        return organRepository.findById(id)
                .orElseThrow(() -> new OrganNotFoundException(id));
    }
}
