package com.scott.organ_stopper_server.service;

import com.scott.organ_stopper_server.model.Organ;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;

@Service
public class OrganService {
    private static final HashMap<Integer, Organ> organs = new HashMap<>();

    public OrganService() {
        organs.put(0, new Organ("Walt Disney Concert Hall"));
        organs.put(1, new Organ("Richland Stake Center"));
    }

    public Organ getOrgan(int index) {
        if (!organs.containsKey(index)) {
            String errorMessage = "Provided index: " + index + " is not a valid index to retrieve an organ.  Please provide an index ";
            errorMessage += organs.keySet().stream().max(Comparator.naturalOrder())
                    .map(maxKey -> "between 0 and " + maxKey)
                    .orElse("greater than 0");
            throw new IllegalArgumentException(errorMessage);
        }

        return organs.get(index);
    }
}
