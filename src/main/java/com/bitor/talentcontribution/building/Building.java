package com.bitor.talentcontribution.building;

import java.util.UUID;

import com.bitor.talentcontribution.member.Proprietor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Building {
    @Id
    private UUID id;

    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String address_detail;
    @Column
    private Double latitude;
    @Column
    private Double longitude;

    @ManyToOne
    private Proprietor proprietor;
}
