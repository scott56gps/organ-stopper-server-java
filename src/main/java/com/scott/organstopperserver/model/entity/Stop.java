package com.scott.organstopperserver.model.entity;

import com.scott.organstopperserver.model.PipeLength;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Stop {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private PipeLength length;

    public Stop() {}

    public Stop(String name, PipeLength length) {
        this.name = name;
        this.length = length;
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

    public PipeLength getLength() {
        return length;
    }

    public void setLength(PipeLength length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Stop{" + "id=" + id + ", name=" + name + ", pipeLength=" + length.getDisplayLength() + "} ";
    }
}
