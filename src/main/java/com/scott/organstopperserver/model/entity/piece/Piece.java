package com.scott.organstopperserver.model.entity.piece;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Piece {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany
    private List<OrganConfiguration> organConfigurations;

    public Piece() {

    }

    public Piece(String name, List<OrganConfiguration> organConfigurations) {
        this.name = name;
        this.organConfigurations = organConfigurations;
    }
}
