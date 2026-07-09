package com.aditya.DataSync.Service;

import com.aditya.DataSync.Entity.Project;
import com.aditya.DataSync.Exceptions.DublicateProjectException;
import com.aditya.DataSync.Exceptions.ProjectNotFoundException;
import com.aditya.DataSync.Repo.ProjectRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    // Create Project
    public Project createProject(Project project) {


        if (projectRepository.existsByTitle(project.getTitle())) {
            throw new DublicateProjectException(
                    "Project with the title " +project.getTitle()+" already exists."
            );
        }

        project.setCreatedAt(LocalDateTime.now());
        project.setUpdatedAt(LocalDateTime.now());

        return projectRepository.save(project);
    }

    // Get All Projects
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }


    public Project getProjectById(Long id) {

        return projectRepository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException("Project not found."));
    }


    public Project updateProject(Long id, Project updatedProject) {

        Project existingProject = projectRepository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException("Project not found."));

        existingProject.setTitle(updatedProject.getTitle());
        existingProject.setDescription(updatedProject.getDescription());
        existingProject.setActive(updatedProject.isActive());
        existingProject.setUpdatedAt(LocalDateTime.now());

        return projectRepository.save(existingProject);
    }

    // Delete Project
    public void deleteProject(Long id) {

        if (!projectRepository.existsById(id)) {
            throw new ProjectNotFoundException("Project not found.");
        }

        projectRepository.deleteById(id);
    }

    // Search by Title
    public Project getProjectByTitle(String title) {

        return projectRepository.findByTitle(title)
                .orElseThrow(() -> new ProjectNotFoundException("Project not found."));
    }

}