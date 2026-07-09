package com.aditya.DataSync.Service;

import com.aditya.DataSync.Entity.AuditTrail;
import com.aditya.DataSync.Repo.AuditTrailRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuditTrailService {

    private final AuditTrailRepository auditTrailRepository;

    public AuditTrailService(AuditTrailRepository auditTrailRepository) {
        this.auditTrailRepository = auditTrailRepository;
    }

    public AuditTrail saveAudit(AuditTrail auditTrail) {

        auditTrail.setActionTime(LocalDateTime.now());

        return auditTrailRepository.save(auditTrail);
    }

    public List<AuditTrail> getAllAudits() {
        return auditTrailRepository.findAll();
    }

    public List<AuditTrail> getProjectAudit(Long projectId) {
        return auditTrailRepository.findByProjectId(projectId);
    }

    public List<AuditTrail> getEmployeeAudit(String employeeId) {
        return auditTrailRepository.findByEmployeeId(employeeId);
    }

}