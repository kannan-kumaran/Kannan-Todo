package com.online.todolist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online.todolist.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	@Query("SELECT T FROM TASK T WHERE T.userEmail = ?1")
    List<Task> findByName(String userEmail);
	
}
