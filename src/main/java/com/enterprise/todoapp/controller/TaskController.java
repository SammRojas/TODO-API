package com.enterprise.todoapp.controller;

import com.enterprise.todoapp.persistence.Entity.Task;
import com.enterprise.todoapp.persistence.Entity.TaskStatus;
import com.enterprise.todoapp.service.Dto.TaskInDTO;
import com.enterprise.todoapp.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody TaskInDTO taskInDTO) {
        return this.taskService.createTask(taskInDTO);
    }

    @GetMapping
    public List<Task> finAll(){
        return this.taskService.findAll();
    }

    @GetMapping("/status/{status}")
    public List<Task> findAllbyStatus(@PathVariable("status") TaskStatus status){
        return this.taskService.findAllByTaskStatus(status);
    }

    @PatchMapping("/mark_as_finished/{id}")
    public ResponseEntity<Void> markAsFiniched(@PathVariable("id") Long id) {
        this.taskService.updateTaskAsFinished(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        this.taskService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
