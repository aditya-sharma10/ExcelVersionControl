# ExcelVersionControl

A backend application for version controlling Excel-based financial models used in Investment Banking, Private Equity, Corporate Finance, and Financial Planning & Analysis (FP&A).

## Overview

ExcelVersionControl eliminates the need for manually maintaining multiple Excel files such as:

```
DCF_Model_v1.xlsx
DCF_Model_v2.xlsx
DCF_Model_FINAL.xlsx
DCF_Model_FINAL2.xlsx
DCF_Model_CLIENT.xlsx
```

Instead, the application provides centralized version management, change tracking, and audit history for Excel workbooks.

The project is inspired by modern version control systems but is designed specifically for finance professionals who work extensively with Microsoft Excel.

---

## Features

### Current

- REST API built with Spring Boot
- User Authentication & Authorization
- Project Management APIs
- Exception Handling
- DTO Architecture
- Unit Testing using JUnit & Mockito

### Planned

- Upload Excel Workbooks
- Automatic Version Creation
- Workbook Version History
- Compare Two Versions
- Cell-Level Change Tracking
- Formula Change Detection
- Restore Previous Versions
- Audit Logs
- Role-Based Access Control
- Approval Workflow

---

## Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Backend |
| Spring Boot | REST API |
| Spring Security | Authentication |
| Spring Data JPA | Database Access |
| PostgreSQL | Database |
| Maven | Build Tool |
| JUnit 5 | Testing |
| Mockito | Unit Testing |
| Apache POI | Excel Parsing *(Upcoming)* |
| Docker | Containerization *(Upcoming)* |
| Jenkins | CI/CD *(Upcoming)* |

---

## Project Structure

```
src
├── main
│   ├── java
│   │   ├── controller
│   │   ├── service
│   │   ├── repository
│   │   ├── entity
│   │   ├── dto
│   │   ├── security
│   │   ├── config
│   │   └── exception
│   └── resources
│
└── test
    └── java
```

---

## Project Roadmap

- [x] Spring Boot Backend
- [x] REST APIs
- [x] Authentication
- [x] Unit Testing
- [ ] Excel Upload
- [ ] Apache POI Integration
- [ ] Workbook Versioning
- [ ] Workbook Comparison
- [ ] Cell-Level Diff Engine
- [ ] Formula Tracking
- [ ] Restore Previous Version
- [ ] Docker Support
- [ ] Jenkins CI/CD Pipeline
- [ ] AWS Deployment

---

## Future Vision

The goal is to build a version control platform for financial models that allows analysts, associates, and investment bankers to:

- Track every workbook revision
- Understand exactly what changed
- Restore previous versions
- Collaborate securely
- Reduce errors caused by multiple Excel copies

---

## Author

**Aditya Sharma**

B.Tech – Machine Learning & Data Science  
Backend Developer | Finance Enthusiast

---

## License

This project is intended for educational and portfolio purposes.