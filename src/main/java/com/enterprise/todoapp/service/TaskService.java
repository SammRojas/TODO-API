package com.enterprise.todoapp.service;

import com.enterprise.todoapp.mapper.TaskInDTOToTask;
import com.enterprise.todoapp.persistence.Entity.Task;
import com.enterprise.todoapp.persistence.repository.TaskRepository;
import com.enterprise.todoapp.service.Dto.TaskInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private final TaskRepository repository;
    @Autowired
    private final TaskInDTOToTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDTO) {

        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
    }

    public List<Task> findAll() {
        return this.repository.findAll();
    }
}
