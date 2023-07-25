package com.bitor.talentcontribution.member;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
public abstract class Member {
    @Id
    private UUID id;

    @Column
    private String name;
    @Column
    private String phone;
}
