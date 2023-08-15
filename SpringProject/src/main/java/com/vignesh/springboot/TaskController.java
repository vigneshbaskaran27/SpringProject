package com.vignesh.springboot;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vignesh.springboot.pojos.Task;
@RestController("/task")
@RequestMapping("/task")
public class TaskController {

	ArrayList<Task> taskList= new ArrayList<>();
	
	@PostMapping("/")
	public Task addTask(@RequestBody Task task)
	{
		taskList.add(task);
		return task;
	}
	
	@GetMapping("/")
	public ArrayList<Task> getallTasks()
	{
		return taskList;
	}
	
	
	@GetMapping("/{id}")
	public Task getTask(@RequestParam int id)
	{
		return taskList.get(id);
	}
}
