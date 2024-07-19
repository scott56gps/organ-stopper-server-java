package com.scott.organstopperserver.model.entity.piece;

import com.scott.organstopperserver.model.entity.organ.Stop;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "stop_combination")
public class StopCombination {
    @Id @GeneratedValue
    private Long id;
    private int preset;

    @OneToMany
    private List<Stop> stops;
}
