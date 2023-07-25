package com.bitor.talentcontribution.lecture;

import java.util.UUID;

import com.bitor.talentcontribution.member.Teacher;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lecture {
    @Id
    private UUID id;

    @Column
    private String title;

    @ManyToOne
    private Teacher teacher;
}
