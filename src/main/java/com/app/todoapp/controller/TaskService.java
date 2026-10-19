package com.app.todoapp.controller;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.todoapp.model.Task;
import com.app.todoapp.repository.TaskRepository;

@Service
public class TaskService {
	private final TaskRepository taskRepo;
	
	public TaskService(TaskRepository tr) {
		this.taskRepo = tr;
	}
	public List<Task> getAllTasks(){
		return taskRepo.findAll();
		
		
	}
	
	public void createTask(String title) {
		Task task = new Task();
		task.setTitle(title);
		task.setCompleted(false);
		taskRepo.save(task);
	}

}
