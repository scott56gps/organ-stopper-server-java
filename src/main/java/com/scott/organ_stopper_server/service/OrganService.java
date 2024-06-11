package com.scott.organ_stopper_server.service;

import com.scott.organ_stopper_server.model.Organ;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrganService {
    private static List<Organ> organs = new ArrayList<>();

    public OrganService() {}

    public OrganService(List<String> organNames) {
        organs = organNames.stream()
                .map(Organ::new)
                .collect(Collectors.toList());
    }

    public Organ getOrgan(int index) {
        if (organs.isEmpty()) {
            throw new RuntimeException("There are no organs.  Please create an organ.");
        }
        if (index < 0) {
            throw new IllegalArgumentException("Cannot retrieve organ for index less than 0.");
        }
        if (index >= organs.size()) {
            String errorMessage = "Provided index: " + index + " is out of range.  " +
                    "Please provide an index between 0 and " + (organs.size() - 1);
            throw new IllegalArgumentException(errorMessage);
        }

        return organs.get(index);
    }

    public void appendOrganNames(List<String> organNames) {
        organs.addAll(organNames.stream().map(Organ::new).toList());
    }
}
