package com.tasktracker.task_manager.model;

import jakarta.persistence.*;
import lombok.*;

@Entity // Table in db
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Increment
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    private boolean completed;
}
