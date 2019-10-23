package com.ensa.springreact.repository;

import com.ensa.springreact.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask,Long > {
    ProjectTask getById(Long id);
}
