package com.scott.organ_stopper_server.model;

import java.util.Arrays;
import java.util.List;

public class Organ {
    private Integer id;
    private final String name;
    private final List<Division> divisions;

    /**
     * Convenience constructor to create dummy division data for every organ
     * @param name The name of an organ to construct
     */
    public Organ(String name) {
        this.name = name;
        this.divisions = Arrays.asList(
                new Division("Great", Arrays.asList(
                        new Stop("Diapason", PipeLength.EIGHT),
                        new Stop("Bourdon", PipeLength.EIGHT))),
                new Division("Swell", Arrays.asList(
                        new Stop("Grand Jeux", PipeLength.TWO_TWO_THIRDS),
                        new Stop("Principal", PipeLength.EIGHT),
                        new Stop("Prestant", PipeLength.FOUR),
                        new Stop("Doublette", PipeLength.TWO))),
                new Division("Pedal", Arrays.asList(
                        new Stop("Principal", PipeLength.SIXTEEN),
                        new Stop("Principal", PipeLength.EIGHT),
                        new Stop("Choral Bass", PipeLength.FOUR))));
    }
    public Organ(String name, List<Division> divisions) {
        this.name = name;
        this.divisions = divisions;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Division> getDivisions() {
        return divisions;
    }
}
