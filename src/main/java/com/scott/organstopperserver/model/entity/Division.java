package com.scott.organstopperserver.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Division {
    @Id @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<Stop> stops;

    public Division() {}
    public Division(String name, List<Stop> stops) {
        this.name = name;
        this.stops = stops;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    @Override
    public String toString() {
        return "Division{" + "id=" + id + ", name=" + name + ", stops:" + stops.stream()
                .reduce(new StringBuilder(), (accum, stop) -> accum.append(stop.toString()),
                        StringBuilder::append) + "} ";
    }
}
