/**
 * 
 */
package uk.ac.belfastmet.tasks.service;

import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.belfastmet.tasks.domain.Task;

/**
 * @author Ric19171870
 *
 */
public class TasksServices {
	
	Logger log = LoggerFactory.getLogger(TasksServices.class);

	// ArrayList containing all tasks from getTasks()
	private ArrayList<Task> tasks;

	/**
	 * method to populate task array
	 * @return tasks array
	 */
	public ArrayList<Task> getTasks() {
		log.info("instantiating java array ");
		this.tasks = new ArrayList<Task>();

		/*
		 * Task constructor order
		 * Task(String userName, String taskName, String description,
		 * String priority, String completionDate, boolean completed)
		 */
		
		this.tasks.add(new Task("user name", "task name", "description", "priority", setDate(23,9,2019) , false));
		this.tasks.add(new Task("user name2", "task Name2", "description2", "priority2", setDate(23,9,2019), true));
		
		log.info(" tasks array populated ");
		
		return tasks;
	}
	
	@SuppressWarnings("deprecation")
	public Date setDate( int day, int month, int year) {
		
		Date date= new Date (); 
		date.setDate(day);
		date.setMonth(month);
		date.setYear(year);
		
		return date;//completionDate;
	}

}
