package com.vignesh.springboot.pojos;

public class Task {
	private String id;
	private String title;
	private String due_date;
	private boolean completed;
	public Task(String id, String title, String due_date, boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.due_date = due_date;
		this.completed = completed;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public Task() {
		super();
	}
	
	
	
}
