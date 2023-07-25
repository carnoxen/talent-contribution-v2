package com.bitor.talentcontribution.member;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProprietorRepository extends JpaRepository<UUID, Proprietor> {
    
}
