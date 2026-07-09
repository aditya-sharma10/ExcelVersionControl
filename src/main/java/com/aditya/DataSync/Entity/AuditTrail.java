package com.aditya.DataSync.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "audit_trail")
public class AuditTrail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long projectId;

    private String employeeId;

    private String employeeName;

    private String action;

    private String fileName;

    private Integer versionNumber;

    private String remarks;

    private LocalDateTime actionTime;

    public AuditTrail() {
    }
}