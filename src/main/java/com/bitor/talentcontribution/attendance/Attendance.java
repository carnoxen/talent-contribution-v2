package com.bitor.talentcontribution.attendance;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.UUID;

import com.bitor.talentcontribution.curriculum.Curriculum;
import com.bitor.talentcontribution.member.Student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendance {
    @Id
    private UUID id;

    @Column
    private Optional<Timestamp> check;

    @ManyToOne
    private Student student;
    @ManyToOne
    private Curriculum curriculum;
}
