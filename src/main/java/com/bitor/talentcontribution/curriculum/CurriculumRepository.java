package com.bitor.talentcontribution.curriculum;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CurriculumRepository extends JpaRepository<UUID, Curriculum> {
    
}
