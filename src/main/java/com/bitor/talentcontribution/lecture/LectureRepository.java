package com.bitor.talentcontribution.lecture;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LectureRepository extends JpaRepository<UUID, Lecture> {
    
}
