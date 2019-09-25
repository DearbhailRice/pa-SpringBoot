/**
 * 
 */
package uk.ac.belfastmet.tasks.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import uk.ac.belfastmet.tasks.service.TasksServices;

/**
 * @author Ric19171870
 *
 */
@Controller
@RequestMapping
@Service
public class TaskController {

	@Autowired
	private TasksServices tasksServices;

	Logger log = LoggerFactory.getLogger(TaskController.class);

	/**
	 * method to direct to home page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome(Model model) {
		log.info("ON HOME PAGE");

		tasksServices.getNumberoftasks();

		return "index";

	}

	/**
	 * method to direct to to do list html page calls get tasks() from task services
	 * 
	 * @return toDoList html page
	 */
	@RequestMapping(value = "/toDoList", method = RequestMethod.GET)
	public String getToDoList(Model model) {
		log.info("ON TO DO LIST PAGE");

		// TasksServices taskServices = new TasksServices();

		model.addAttribute("tasks", tasksServices.getTasks());
		// model.addAttribute("bgColour", tasksServices.colourPriority())

		// log.info("populated task array" + tasksServices.getTasks().toString());
		return "toDoList";

	}

	/**
	 * method for login page
	 * 
	 * @return login html page
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin() {
		log.info("ON LOGIN PAGE");

		return "login";

	}

	/**
	 * method for completed tasks page
	 * 
	 * @param model
	 * @return completedTasks html page
	 */
	@RequestMapping(value = "/completedTasks", method = RequestMethod.GET)
	public String getcompletedTasks(Model model) {
		log.info("ON COMPLETED TASKS");

		// TasksServices taskServices = new TasksServices();

		model.addAttribute("tasks", tasksServices.getTasks());
		model.addAttribute("TaskCompleted", "bg-success text-dark");
		return "completedTasks";

	}

	/**
	 * method for mapping to incomplete tasks page
	 * 
	 * @param model
	 * @return incompletedTasks html page
	 */
	@RequestMapping(value = "/incompleteTasks", method = RequestMethod.GET)
	public String getincompleteTasks(Model model) {
		log.info("ON INCOMPLETE TASKS");

		// TasksServices taskServices = new TasksServices();

		model.addAttribute("tasks", tasksServices.getTasks());
		return "incompleteTasks";

	}

	/**
	 * method to change background colour of cards according to set priority
	 */
	public String colourPriority(String priority) {
		String bgColour = null;

		if (priority.equalsIgnoreCase("high")) {
			bgColour = "bg-danger";
		} else if (priority.equalsIgnoreCase("medium")) {
			bgColour = "bg-warning";
		} else if (priority.equalsIgnoreCase("low")) {
			bgColour = "bg-success";
		} else {
			bgColour = "bg-light";
		}
		return bgColour;
	}

}
