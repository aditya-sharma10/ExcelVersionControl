# ExcelVersionControl

ExcelVersionControl is a backend application that brings Git-inspired version control to Microsoft Excel workbooks used in Investment Banking, Private Equity, Corporate Finance, and FP&A.

Instead of maintaining multiple copies of financial models, the application provides centralized workbook management, audit trails, and the foundation for version history and workbook comparison.

---

## Why ExcelVersionControl?

Financial teams often end up with files like:

```text
AsianPaints.xlsx
AsianPaints_v2.xlsx
AsianPaints_FINAL.xlsx
AsianPaints_FINAL_FINAL.xlsx
AsianPaints_CLIENT.xlsx
```

This project replaces that workflow with a centralized system where every workbook upload is tracked, versioned, and associated with the employee who uploaded it.

---

# Current Features

- Project Management REST APIs
- User Management
- Spring Security Authentication
- Excel Workbook Upload
- Excel Parsing using Apache POI
- Workbook Sheet Extraction
- Audit Trail Management
- Global Exception Handling
- DTO Architecture
- Unit Testing (JUnit & Mockito)
- Jenkins Continuous Integration Pipeline
- PostgreSQL Database Integration

---

# Technology Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Backend |
| Spring Boot | REST API |
| Spring Security | Authentication |
| Spring Data JPA | ORM |
| PostgreSQL | Database |
| Apache POI | Excel Parsing |
| Maven | Build Tool |
| JUnit 5 | Unit Testing |
| Mockito | Mock Testing |
| Jenkins | Continuous Integration |
| Git & GitHub | Version Control |

---

# Current Project Structure

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

# Roadmap

## Completed

- [x] Spring Boot Backend
- [x] PostgreSQL Integration
- [x] Project CRUD APIs
- [x] User Management
- [x] Spring Security
- [x] Apache POI Integration
- [x] Excel Upload API
- [x] Excel Workbook Parsing
- [x] Audit Trail Module
- [x] Jenkins CI Pipeline
- [x] Unit Testing

## Upcoming

- [ ] Workbook Versioning
- [ ] Store Uploaded Workbooks
- [ ] Workbook History
- [ ] Compare Workbook Versions
- [ ] Cell-Level Difference Engine
- [ ] Formula Change Detection
- [ ] Restore Previous Version
- [ ] Branching Support
- [ ] Merge Workbook Versions
- [ ] Role-Based Permissions
- [ ] Dashboard APIs
- [ ] Docker Support
- [ ] AWS Deployment

---

# Project Vision

The goal is to build a collaboration platform for Excel-based financial models where teams can:

- Upload workbook versions
- Track workbook history
- Maintain audit trails
- Compare workbook revisions
- Restore previous versions
- Collaborate without exchanging multiple Excel files
- Reduce operational risk caused by duplicate workbook copies

---

# Continuous Integration

Every push to GitHub triggers the Jenkins pipeline, which:

- Compiles the project
- Executes unit tests
- Packages the application
- Prevents failed code from being merged

---

# Author

**Aditya Sharma**

Backend Developer | Finance Enthusiast | B.Tech (Machine Learning & Data Science)

---

# License

This project is developed for educational, research, and portfolio purposes.