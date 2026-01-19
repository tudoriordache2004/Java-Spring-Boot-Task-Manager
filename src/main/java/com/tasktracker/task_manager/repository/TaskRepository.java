package com.tasktracker.task_manager.repository;

import com.tasktracker.task_manager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // This access the db
public interface TaskRepository extends JpaRepository<Task, Long> {

}