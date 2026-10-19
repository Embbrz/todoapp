package com.app.todoapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.todoapp.model.Task;

@Controller

public class TaskController {
	
	private final TaskService taskService;
	
	public TaskController(TaskService t) {
		this.taskService = t;
	}
	
	@GetMapping
	public String getTasks(Model model) {
		
		List<Task> tasks = taskService.getAllTasks();
		model.addAttribute("tasks",tasks);
		return "tasks";
	}

}

