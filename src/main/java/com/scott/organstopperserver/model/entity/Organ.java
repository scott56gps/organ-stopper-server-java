package com.scott.organstopperserver.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Organ {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<Division> divisions;

    public Organ() {}

    public Organ(String name, List<Division> divisions) {
        this.name = name;
        this.divisions = divisions;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Division> getDivisions() {
        return divisions;
    }

    @Override
    public String toString() {
        return "Organ{" + "id=" + id + ", name=" + name + ", divisions:" + divisions.stream()
                .reduce(new StringBuilder(), (accum, division) -> accum.append(division.toString()),
                        StringBuilder::append) + "} ";
    }
}
