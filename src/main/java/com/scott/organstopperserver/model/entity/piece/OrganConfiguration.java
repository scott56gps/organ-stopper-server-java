package com.scott.organstopperserver.model.entity.piece;

import com.scott.organstopperserver.model.entity.organ.Organ;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "organ_configuration")
public class OrganConfiguration {
    @Id @GeneratedValue
    private Long id;

    @OneToMany
    private List<StopCombination> stopCombinations;

    public OrganConfiguration() {}

    public OrganConfiguration(List<StopCombination> stopCombinations) {
        this.stopCombinations = stopCombinations;
    }
}
