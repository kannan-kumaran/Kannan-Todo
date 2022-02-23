package com.online.todolist.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.todolist.model.Task;
import com.online.todolist.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	TaskRepository taskRepository;

	public List<Task> getAllTasksByUser(String name) {
		List<Task> tasks = new ArrayList<Task>();  
		taskRepository.findByName(name).forEach(task -> tasks.add(task));  
		return tasks;  
	}
	
	public Task getTaskbyId(int taskId) {
		Optional<Task> task = taskRepository.findById(taskId);
		return task.get();
	}
	
	public void saveOrUpdate(Task task)   
	{  
		LocalDate today = LocalDate.now();
		task.setLastUpdatedDate( java. sql. Date. valueOf(today));
		taskRepository.save(task);  
	} 
	
	public void deleteTaskByID(int id) {
		taskRepository.deleteById(id);
	}
}
