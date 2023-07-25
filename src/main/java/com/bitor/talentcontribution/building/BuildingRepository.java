package com.bitor.talentcontribution.building;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BuildingRepository extends JpaRepository<UUID, Building> {
    
}
