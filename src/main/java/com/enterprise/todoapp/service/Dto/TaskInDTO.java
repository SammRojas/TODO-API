package com.enterprise.todoapp.service.Dto;

import com.enterprise.todoapp.persistence.Entity.TaskStatus;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TaskInDTO {
    private String title;
    private String description;
    private LocalDateTime eta;
}
