/**
 * 
 */
package uk.ac.belfastmet.tasks.service;

//import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//ensure service imported
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.tasks.controller.TaskController;
import uk.ac.belfastmet.tasks.domain.Task;
import uk.ac.belfastmet.tasks.repository.TasksRepository;

/**
 * @author Ric19171870
 *
 */
@Service
public class TasksServices {

	Logger log = LoggerFactory.getLogger(TaskController.class);
	// ArrayList<Task> tasksArray = new ArrayList <Task>();
	
	
	@Autowired
	private TasksRepository tasksRepository;

	/*
	 * commented out but retained for learning // ArrayList containing all tasks
	 * from getTasks() private ArrayList<Task> tasks;
	 * 
	 *//**
		 * method to populate task array calls setDate()
		 * 
		 * @return
		 * 
		 * @return tasks array
		 */

	/*
	 * this.tasks = new ArrayList<Task>();
	 * 
	 * 
	 * Task constructor order Task(String userName, String taskName, String
	 * description, String priority, String completionDate, boolean completed)
	 * 
	 * 
	 * this.tasks.add(new Task("user name", "task name", "description", "priority",
	 * setDate(23, 9, 2019), false)); this.tasks.add(new Task("user name2",
	 * "task Name2", "description2", "priority2", setDate(23, 9, 2019), true));
	 * 
	 * log.info(" tasks array populated ");
	 */

	/**
	 * 
	 * @return tasksiterablke
	 */
	public Iterable<Task> getTasks() {


		log.info("looping through the database  ");
		// iterator to loop through data from tasks database
		Iterable<Task> tasks = tasksRepository.findAll();
		Iterator<Task> iterator = tasks.iterator();
		
		
		  while (iterator.hasNext()) {
			  
			  //tasksArray.add(iterator.next());
		  log.info("{}", iterator.next().toString()); log.info("one row "); }
		  
		log.info("returns ",tasks.toString());
		
		return tasks;

	}
	
	public void iteratorTasksToArry() {
		
	}

	/**
	 * method to get the number of tasks from the mysql database
	 */
	public void getNumberoftasks() {

		log.info(tasksRepository.toString());
		log.info("# number of tasks {}", tasksRepository.count());

	}

	// null method from pre database connection retained as will update
	/**
	 * method to set date format
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @return date
	 */
	@SuppressWarnings("deprecation")
	public Date setDate(int day, int month, int year) {

		Date date = new Date();
		date.setDate(day);
		date.setMonth(month);
		date.setYear(year);

		return date;// completionDate;
	}
	
	

}
