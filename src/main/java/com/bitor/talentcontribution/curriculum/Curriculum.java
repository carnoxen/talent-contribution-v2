package com.bitor.talentcontribution.curriculum;

import java.sql.Date;
import java.sql.Time;
import java.util.Optional;
import java.util.UUID;

import com.bitor.talentcontribution.lecture.Lecture;
import com.bitor.talentcontribution.room.Room;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Curriculum {
    @Id
    private UUID id;

    @Column
    private String title;
    @Column
    private Date scheduled;
    @Column
    private Time from;
    @Column
    private Time to;

    @ManyToOne
    private Lecture lecture;
    @ManyToOne
    private Optional<Room> room; // optional for remote hour
}
