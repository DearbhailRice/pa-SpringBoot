/**
 * 
 */
package com.example.tasks.service;

import java.util.ArrayList;


import com.example.tasks.domain.Task;

/**
 * @author Ric19171870
 *
 */
public class TasksServices {
	
	/**
	 * ArrayList containg all tasks from getTasks()
	 */
	private ArrayList <Task> tasks; 
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Task> getTasks() {
		this.tasks=new ArrayList <Task>();
		
		/*
		 * Task constructor 
		 * Task(String userName, String taskName, String description, String priority, String completionDate,
			boolean completed) 
		 */
		
		this.tasks.add(new Task("user name","task name","description", "priority","23/09/19", false ));
		this.tasks.add(new Task("user name2","task Name2","description2", "priority2","24/09/19", true ));
		
		return tasks;
	}
	
	
	
	

}
