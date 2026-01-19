package com.tasktracker.task_manager.service;

import com.tasktracker.task_manager.model.Task;
import com.tasktracker.task_manager.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getPendingTasks() {
        return taskRepository.findByCompletedFalse();
    }
}