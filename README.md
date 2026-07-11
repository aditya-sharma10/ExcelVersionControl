# ExcelVersionControl

ExcelVersionControl is a backend application that brings Git-inspired version control to Microsoft Excel workbooks used in Investment Banking, Private Equity, Corporate Finance, and FP&A.

Instead of maintaining multiple copies of financial models, the application provides centralized workbook management, Excel parsing, audit trails, and lays the foundation for workbook versioning and comparison.

---

# The Problem

Financial analysts often end up managing workbooks like:

```text
AsianPaints.xlsx
AsianPaints_v2.xlsx
AsianPaints_FINAL.xlsx
AsianPaints_FINAL_FINAL.xlsx
AsianPaints_CLIENT.xlsx
```

As financial models evolve through multiple revisions and contributors, keeping track of the latest workbook becomes increasingly difficult.

ExcelVersionControl replaces this workflow with a centralized platform where every workbook upload is tracked, versioned, and associated with the employee who uploaded it.

---

# Current Features

- Project Management REST APIs
- User Management APIs
- Spring Security Authentication
- Excel Workbook Upload
- Excel Parsing using Apache POI
- Workbook Sheet Extraction
- Audit Trail Management
- Global Exception Handling
- DTO Architecture
- PostgreSQL Integration
- Unit Testing (JUnit & Mockito)
- Jenkins Continuous Integration Pipeline

---

# Technology Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Backend |
| Spring Boot | REST API |
| Spring Security | Authentication |
| Spring Data JPA | ORM |
| PostgreSQL | Database |
| Apache POI | Excel Processing |
| Maven | Dependency Management |
| JUnit 5 | Unit Testing |
| Mockito | Mock Testing |
| Jenkins | Continuous Integration |
| Git & GitHub | Version Control |

---

# Project Structure

```text
src
├── main
│   ├── java
│   │   ├── Controller
│   │   ├── Service
│   │   ├── Repo
│   │   ├── Entity
│   │   ├── DTO
│   │   ├── Util
│   │   ├── Exceptions
│   │   └── Security
│   └── resources
│
└── test
```

---

# Development Roadmap

## Completed

- ✅ Spring Boot Backend
- ✅ PostgreSQL Integration
- ✅ Project CRUD APIs
- ✅ User Management
- ✅ Spring Security
- ✅ Apache POI Integration
- ✅ Excel Upload API
- ✅ Excel Workbook Parsing
- ✅ Audit Trail Module
- ✅ Jenkins CI Pipeline
- ✅ Unit Testing

## In Progress

- 🚧 Workbook Versioning
- 🚧 Store Uploaded Workbooks

## Planned

- Compare Workbook Versions
- Cell-Level Difference Engine
- Formula Change Detection
- Restore Previous Versions
- Workbook History
- Branching Support
- Merge Workbook Versions
- Role-Based Permissions
- Dashboard APIs
- Docker Containerization
- AWS Deployment

---

# Project Vision

The long-term goal is to build a collaboration platform for Excel-based financial models where finance teams can:

- Upload workbook versions
- Track workbook history
- Compare workbook revisions
- Restore previous versions
- Maintain complete audit trails
- Collaborate without exchanging multiple Excel files
- Reduce operational risk caused by duplicate workbook copies

---

# Continuous Integration

Every push to GitHub automatically triggers the Jenkins pipeline, which:

- Builds the project
- Runs unit tests
- Packages the application
- Prevents broken code from progressing through the pipeline

---

# Future Architecture

```text
Financial Analyst
        │
        ▼
Upload Workbook
        │
        ▼
ExcelVersionControl
        │
 ┌──────┼─────────┐
 ▼      ▼         ▼
Version Audit   Parser
History Trail
        │
        ▼
PostgreSQL
```

---

# Author

**Aditya Sharma**

Backend Developer • Finance Enthusiast • B.Tech (Machine Learning & Data Science)

---

# License

This project is developed for educational, research, and portfolio purposes.