package com.scott.organ_stopper_server.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrganServiceTest {
    private static OrganService target;

    @BeforeEach
    void setTarget() {
        target = new OrganService();
    }

    @Test
    void getOrgan_NoOrgan_ThrowsRuntime() {
        assertThrows(RuntimeException.class, () -> target.getOrgan(0));
    }

    @Test
    void getOrgan_indexGreaterThanOrgans_ThrowsIllegalArgument() {
        List<String> organNames = List.of("Walt Disney Concert Hall", "Richland Stake Center");
        target.appendOrgansByNames(organNames);

        // Our errant index is created by taking more than 1 of the size of the names that we passed in
        int inputIndex = organNames.size() + 1;
        assertThrows(IllegalArgumentException.class, () ->
                target.getOrgan(inputIndex));
    }

    @Test
    void getOrgan_indexLessThanZero_ThrowsIllegalArgument() {
        List<String> organNames = List.of("Walt Disney Concert Hall", "Richland Stake Center");
        target.appendOrgansByNames(organNames);

        int inputIndex = -1;
        assertThrows(IllegalArgumentException.class, () -> target.getOrgan(inputIndex));
    }
}