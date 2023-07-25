package com.bitor.talentcontribution.room;

import java.util.UUID;

import com.bitor.talentcontribution.building.Building;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Room {
    @Id
    private UUID id;

    @Column
    private String name;
    @Column
    private Integer floor;

    @ManyToOne
    private Building building;
}
