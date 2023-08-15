package com.vignesh.springboot;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private ArrayList<String> greetingAvailable=new ArrayList<>();
	@GetMapping("/hello/{id}")
	public String hello(@PathVariable String id)
	{
		if( greetingAvailable.isEmpty() || Integer.parseInt(id) >= greetingAvailable.size())
		return "Hello World!";
		
		return greetingAvailable.get(Integer.parseInt(id));
		
	}
	@PostMapping("/greetings")
	public void greet(@RequestParam String greeting)
	{
		greetingAvailable.add(greeting);
	}
}
