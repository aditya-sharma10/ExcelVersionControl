package com.aditya.DataSync.Controller;

import com.aditya.DataSync.Dto.ApiResponse;
import com.aditya.DataSync.Entity.Project;
import com.aditya.DataSync.Service.ProjectService;
import com.aditya.DataSync.Util.ExcelParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // Create Project
    @PostMapping
    public ResponseEntity<ApiResponse<Project>> createProject(@RequestBody Project project) {

        Project savedProject = projectService.createProject(project);

        ApiResponse<Project> response = ApiResponse.<Project>builder()
                .success(true)
                .message("Project created successfully.")
                .statusCode(HttpStatus.CREATED.value())
                .timestamp(LocalDateTime.now())
                .data(savedProject)
                .build();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Get All Projects
    @GetMapping
    public ResponseEntity<ApiResponse<List<Project>>> getAllProjects() {

        List<Project> projects = projectService.getAllProjects();

        ApiResponse<List<Project>> response = ApiResponse.<List<Project>>builder()
                .success(true)
                .message("Projects fetched successfully.")
                .statusCode(HttpStatus.OK.value())
                .timestamp(LocalDateTime.now())
                .data(projects)
                .build();

        return ResponseEntity.ok(response);
    }

    // Get Project By ID
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Project>> getProjectById(@PathVariable Long id) {

        Project project = projectService.getProjectById(id);

        ApiResponse<Project> response = ApiResponse.<Project>builder()
                .success(true)
                .message("Project fetched successfully.")
                .statusCode(HttpStatus.OK.value())
                .timestamp(LocalDateTime.now())
                .data(project)
                .build();

        return ResponseEntity.ok(response);
    }

    // Update Project
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Project>> updateProject(
            @PathVariable Long id,
            @RequestBody Project project) {

        Project updatedProject = projectService.updateProject(id, project);

        ApiResponse<Project> response = ApiResponse.<Project>builder()
                .success(true)
                .message("Project updated successfully.")
                .statusCode(HttpStatus.OK.value())
                .timestamp(LocalDateTime.now())
                .data(updatedProject)
                .build();

        return ResponseEntity.ok(response);
    }

    // Delete Project
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteProject(@PathVariable Long id) {

        projectService.deleteProject(id);

        ApiResponse<String> response = ApiResponse.<String>builder()
                .success(true)
                .message("Project deleted successfully.")
                .statusCode(HttpStatus.OK.value())
                .timestamp(LocalDateTime.now())
                .data("Project deleted successfully.")
                .build();

        return ResponseEntity.ok(response);
    }

    // Search Project By Title
    @GetMapping("/title/{title}")
    public ResponseEntity<ApiResponse<Project>> getProjectByTitle(@PathVariable String title) {

        Project project = projectService.getProjectByTitle(title);

        ApiResponse<Project> response = ApiResponse.<Project>builder()
                .success(true)
                .message("Project found successfully.")
                .statusCode(HttpStatus.OK.value())
                .timestamp(LocalDateTime.now())
                .data(project)
                .build();

        return ResponseEntity.ok(response);
    }

}