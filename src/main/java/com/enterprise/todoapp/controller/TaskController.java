package com.enterprise.todoapp.controller;

import com.enterprise.todoapp.persistence.Entity.Task;
import com.enterprise.todoapp.service.Dto.TaskInDTO;
import com.enterprise.todoapp.service.TaskService;
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
}
