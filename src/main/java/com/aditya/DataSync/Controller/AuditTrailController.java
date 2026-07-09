package com.aditya.DataSync.Controller;

import com.aditya.DataSync.Entity.AuditTrail;
import com.aditya.DataSync.Service.AuditTrailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audit")
public class AuditTrailController {

    private final AuditTrailService auditTrailService;

    public AuditTrailController(AuditTrailService auditTrailService) {
        this.auditTrailService = auditTrailService;
    }

    @PostMapping
    public AuditTrail createAudit(@RequestBody AuditTrail auditTrail) {

        return auditTrailService.saveAudit(auditTrail);
    }

    @GetMapping
    public List<AuditTrail> getAllAudits() {

        return auditTrailService.getAllAudits();
    }

    @GetMapping("/project/{projectId}")
    public List<AuditTrail> getProjectAudit(@PathVariable Long projectId) {

        return auditTrailService.getProjectAudit(projectId);
    }

    @GetMapping("/employee/{employeeId}")
    public List<AuditTrail> getEmployeeAudit(@PathVariable String employeeId) {

        return auditTrailService.getEmployeeAudit(employeeId);
    }

}