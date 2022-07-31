package com.enterprise.todoapp.persistence.repository;

import com.enterprise.todoapp.persistence.Entity.Task;
import com.enterprise.todoapp.persistence.Entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findAllByTaskStatus(TaskStatus status);
    @Modifying
    @Query(value = "UPDATE TASK SET FINISHED=true WHERE ID=:id", nativeQuery = true)
    public void markTaskAsFinished(@Param("id") Long id);
}
