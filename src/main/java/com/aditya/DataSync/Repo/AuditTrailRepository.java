package com.aditya.DataSync.Repo;

import com.aditya.DataSync.Entity.AuditTrail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuditTrailRepository extends JpaRepository<AuditTrail, Long> {

    List<AuditTrail> findByProjectId(Long projectId);

    List<AuditTrail> findByEmployeeId(String employeeId);

}