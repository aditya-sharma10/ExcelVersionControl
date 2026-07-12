# ExcelVersionControl

> **Git-inspired version control for Microsoft Excel workbooks used in Investment Banking, Private Equity, Corporate Finance, and FP&A.**

ExcelVersionControl is a backend application built with **Spring Boot** that modernizes the way financial teams manage Excel workbooks. Inspired by Git, the platform centralizes workbook management, parses Excel files, maintains audit trails, and lays the foundation for workbook versioning, comparison, and collaborative financial modeling.

Rather than managing multiple copies of the same financial model through emails and shared folders, ExcelVersionControl provides a centralized and secure solution for workbook management.

---

# Problem Statement

Financial analysts frequently exchange Excel workbooks while creating valuation models, financial statements, forecasting models, and budgeting reports.

This often results in multiple copies of the same workbook:

```text
AsianPaints.xlsx
AsianPaints_v2.xlsx
AsianPaints_FINAL.xlsx
AsianPaints_FINAL_FINAL.xlsx
AsianPaints_CLIENT.xlsx
```

As multiple analysts work on the same workbook, several challenges arise:

- Duplicate workbook copies
- Difficulty identifying the latest version
- No centralized storage
- No audit history
- High operational risk
- No workbook comparison
- No rollback capability

ExcelVersionControl aims to solve these challenges by introducing Git-inspired concepts into Excel workbook management.

---

# Project Objectives

- Centralize Excel workbook management
- Parse uploaded Excel workbooks
- Track workbook ownership
- Maintain audit trails
- Build a scalable architecture for workbook versioning
- Automate build and deployment using CI/CD

---

# Features

## Workbook Management

- Upload Excel Workbooks
- Parse Excel Files using Apache POI
- Extract Workbook Sheets
- Store Workbook Metadata

## Project Management

- Create Projects
- Update Projects
- Delete Projects
- Search Projects
- Project Status Management

## User Management

- User Registration
- Authentication
- Spring Security Integration

## Backend Architecture

- RESTful APIs
- DTO Architecture
- Layered Architecture
- Service Layer
- Repository Layer

## Reliability

- Global Exception Handling
- Custom Exception Classes
- Standardized API Responses

## Database

- PostgreSQL Integration
- Spring Data JPA
- Hibernate ORM

## Testing

- Unit Testing using JUnit 5
- Mockito

## DevOps

- Maven Build Automation
- Jenkins Continuous Integration
- Docker Containerization
- Docker Compose Deployment

---

# Technology Stack

| Category | Technology |
|----------|------------|
| Language | Java 21 |
| Framework | Spring Boot |
| Security | Spring Security |
| ORM | Spring Data JPA |
| Database | PostgreSQL |
| Excel Processing | Apache POI |
| Build Tool | Maven |
| Testing | JUnit 5 |
| Mocking | Mockito |
| Containerization | Docker |
| Orchestration | Docker Compose |
| CI/CD | Jenkins |
| Version Control | Git & GitHub |

---

# System Architecture

```text
                           GitHub
                              │
                              ▼
                      Jenkins Pipeline
                              │
                    Maven Build Pipeline
                              │
                     Docker Image Build
                              │
                    Docker Compose Deploy
                              │
        ┌─────────────────────┴─────────────────────┐
        ▼                                           ▼
 Spring Boot Application                    PostgreSQL Database
        │
        ▼
 Business Layer
        │
 ┌──────┼───────────────┐
 ▼      ▼               ▼
REST APIs   Excel Parser   Audit Trail
        │
        ▼
 Workbook Management
```

---

# CI/CD Pipeline

Every push to GitHub automatically triggers the Jenkins pipeline.

Pipeline Workflow

```text
Developer
     │
     ▼
Git Push
     │
     ▼
GitHub Repository
     │
     ▼
Jenkins
     │
     ├── Checkout Source Code
     ├── Maven Clean
     ├── Unit Tests
     ├── Package Application
     ├── Build Docker Image
     ├── Docker Compose Deployment
     └── Deploy Updated Application
```

This pipeline ensures that every commit is automatically validated, tested, packaged, containerized, and deployed.

---

# Docker Deployment

The application is fully containerized using Docker.

Docker Compose provisions:

- Spring Boot Application
- PostgreSQL Database

Both services communicate through Docker's internal network, ensuring a reproducible and isolated deployment environment.

---

# Project Structure

```text
ExcelVersionControl
│
├── src
│   ├── main
│   │   ├── java
│   │   │
│   │   ├── controller
│   │   ├── service
│   │   ├── repository
│   │   ├── entity
│   │   ├── dto
│   │   ├── security
│   │   ├── util
│   │   ├── exceptions
│   │   └── config
│   │
│   └── resources
│
├── test
│
├── Dockerfile
├── docker-compose.yml
├── Jenkinsfile
├── pom.xml
└── README.md
```

---

# Current Features

- Spring Boot REST APIs
- Project Management Module
- User Management Module
- Spring Security Authentication
- PostgreSQL Integration
- Excel Workbook Upload
- Apache POI Integration
- Excel Workbook Parsing
- Audit Trail Management
- DTO Architecture
- Global Exception Handling
- Custom Exceptions
- Unit Testing (JUnit & Mockito)
- Jenkins CI Pipeline
- Docker Containerization
- Docker Compose Deployment

---

# Future Enhancements

## Workbook Version Control

- Automatic Version Creation
- Workbook History
- Restore Previous Versions
- Workbook Branching
- Workbook Merge

## Excel Analysis

- Workbook Comparison Engine
- Cell-Level Difference Detection
- Formula Change Detection

## Security

- Role-Based Authorization
- Permission Management

## Dashboard

- Workbook Analytics
- User Activity Dashboard
- Audit Reports

## Cloud

- AWS Deployment
- Kubernetes Support
- Production CI/CD Pipeline

---

# Getting Started

## Clone Repository

```bash
git clone https://github.com/aditya-sharma10/ExcelVersionControl.git
```

## Build the Project

```bash
./mvnw clean package
```

## Run using Docker

```bash
docker compose up -d
```

## Verify Running Containers

```bash
docker ps
```

## Stop Containers

```bash
docker compose down
```

---

# Development Workflow

```text
Developer
     │
     ▼
Git Push
     │
     ▼
GitHub
     │
     ▼
Jenkins
     │
     ▼
Checkout Code
     │
     ▼
Maven Build
     │
     ▼
Run Unit Tests
     │
     ▼
Package JAR
     │
     ▼
Build Docker Image
     │
     ▼
Docker Compose
     │
     ▼
Spring Boot + PostgreSQL
```

---

# Future Vision

The long-term vision of ExcelVersionControl is to become a Git-like collaboration platform for Excel-based financial models.

Future capabilities include:

- Workbook Version History
- Workbook Comparison
- Cell-Level Change Detection
- Formula Tracking
- Workbook Branching
- Merge Workbooks
- Restore Previous Versions
- Role-Based Collaboration
- Complete Audit History
- Enterprise Financial Model Management

---

# Why This Project?

ExcelVersionControl combines software engineering best practices with financial technology by introducing Git-inspired workflows to Excel workbook management.

The project demonstrates:

- Java Backend Development
- Spring Boot
- Spring Security
- PostgreSQL
- Apache POI
- REST API Design
- Layered Architecture
- DTO Pattern
- Global Exception Handling
- Unit Testing
- Jenkins CI/CD
- Docker
- Docker Compose
- Git & GitHub

---

# Author

**Aditya Sharma**

Backend Developer | Java & Spring Boot Developer | Finance Technology Enthusiast

**B.Tech – Machine Learning & Data Science**

---

# License

This project is developed for educational, learning, and portfolio purposes.
Testing Jenkins