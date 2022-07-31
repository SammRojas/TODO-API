package com.enterprise.todoapp.persistence.repository;

import com.enterprise.todoapp.persistence.Entity.Task;
import com.enterprise.todoapp.persistence.Entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findAllByTaskStatus(TaskStatus status);
}
