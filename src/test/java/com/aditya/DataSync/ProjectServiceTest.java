package com.aditya.DataSync;

import com.aditya.DataSync.Entity.Project;
import com.aditya.DataSync.Exceptions.DublicateProjectException;
import com.aditya.DataSync.Exceptions.ProjectNotFoundException;
import com.aditya.DataSync.Repo.ProjectRepository;
import com.aditya.DataSync.Service.ProjectService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class ProjectServiceTest {

    @Mock
    private ProjectRepository projectRepository;

    @InjectMocks
    private ProjectService projectService;

    @Test
    void shouldCreateProject() {

        Project project = new Project();
        project.setTitle("Tesla DCF");
        project.setDescription("DCF Model");
        project.setActive(true);

        when(projectRepository.existsByTitle("Tesla DCF"))
                .thenReturn(false);

        when(projectRepository.save(any(Project.class)))
                .thenReturn(project);

        Project savedProject = projectService.createProject(project);

        assertNotNull(savedProject);
        assertEquals("Tesla DCF", savedProject.getTitle());

        verify(projectRepository, times(1))
                .save(project);
    }
    @Test
    void shouldThrowDuplicateProjectException() {

        Project project = new Project();
        project.setTitle("Tesla DCF");

        when(projectRepository.existsByTitle("Tesla DCF"))
                .thenReturn(true);

        assertThrows(
                DublicateProjectException.class,
                () -> projectService.createProject(project)
        );
    }
    @Test
    void shouldReturnProject() {

        Project project = new Project();
        project.setId(1L);
        project.setTitle("Tesla");

        when(projectRepository.findById(1L))
                .thenReturn(Optional.of(project));

        Project result = projectService.getProjectById(1L);

        assertEquals("Tesla", result.getTitle());
    }
    @Test
    void shouldThrowProjectNotFoundException() {

        when(projectRepository.findById(10L))
                .thenReturn(Optional.empty());

        assertThrows(
                ProjectNotFoundException.class,
                () -> projectService.getProjectById(10L)
        );
    }

}