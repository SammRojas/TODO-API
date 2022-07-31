package com.enterprise.todoapp.persistence.repository;

import com.enterprise.todoapp.persistence.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
