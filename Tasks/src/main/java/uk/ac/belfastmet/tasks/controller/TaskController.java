/**
 * 
 */
package uk.ac.belfastmet.tasks.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.tasks.service.TasksServices;

/**
 * @author Ric19171870
 *
 */
@Controller
@RequestMapping
public class TaskController {

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

		return "index";

	}

	/**
	 * method to direct to to do list html page calls get tasks() from task services
	 * 
	 * @return
	 */
	@RequestMapping(value = "/toDoList", method = RequestMethod.GET)
	public String getToDoList(Model model) {
		log.info("ON TO DO LIST PAGE");

		TasksServices taskServices = new TasksServices();

		model.addAttribute("tasks", taskServices.getTasks());

		log.info("populated task array" + taskServices.getTasks().toString());
		return "toDoList";

	}

	/**
	 * method for login page
	 * 
	 * @return
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
	 * @return
	 */
	@RequestMapping(value = "/completedTasks", method = RequestMethod.GET)
	public String getcompletedTasks(Model model) {
		log.info("ON COMPLETED TASKS");

		TasksServices taskServices = new TasksServices();

		model.addAttribute("tasks", taskServices.getTasks());
		return "completedTasks";

	}

	/**
	 * method for mapping to incomplete tasks page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/incompleteTasks", method = RequestMethod.GET)
	public String getincompleteTasks(Model model) {
		log.info("ON inCOMPLETETASKS");
		TasksServices taskServices = new TasksServices();

		model.addAttribute("tasks", taskServices.getTasks());
		return "incompleteTasks";

	}

}
