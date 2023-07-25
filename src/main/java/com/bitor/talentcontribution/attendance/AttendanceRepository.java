package com.bitor.talentcontribution.attendance;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AttendanceRepository extends JpaRepository<UUID, Attendance> {
    
}
