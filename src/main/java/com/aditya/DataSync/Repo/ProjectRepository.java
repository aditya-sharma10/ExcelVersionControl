package com.aditya.DataSync.Repo;

import com.aditya.DataSync.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Check if a project title already exists
    boolean existsByTitle(String title);

    // Find project by title
    Optional<Project> findByTitle(String title);

}