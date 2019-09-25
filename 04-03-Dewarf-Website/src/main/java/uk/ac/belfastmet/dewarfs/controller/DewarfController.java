package uk.ac.belfastmet.dewarfs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dewarfs.service.DewarfService;
/**
 * 
 * @author ric19171870
 *
 */
@Controller
@RequestMapping
@Service
public class DewarfController {

	@Autowired
	private DewarfService dewarfService;
	
	Logger log = LoggerFactory.getLogger(DewarfController.class);

	/**
	 * map home page to index html
	 * 
	 * @return index
	 */
	@GetMapping()
	public String homePage() {
		return "index";
	}

	/**
	 * 
	 * @param model
	 * @return disney html page
	 */
	@GetMapping("/disney")
	public String disney(Model model) {

		//DewarfService dewarfService = new DewarfService();
		model.addAttribute("pageTitle", "Disney Dewarfs ");
		model.addAttribute("numOfDewarfs", "7");
		model.addAttribute("dewarfs", dewarfService.getDisneyDewarfs());
		log.info(dewarfService.getDisneyDewarfs().toString());

		

		return "disney";
	}

	/**
	 * 
	 * @param model
	 * @return tolkin html page
	 */
	@GetMapping("/tolkin")
	public String tolkin(Model model) {
		//DewarfService dewarfService = new DewarfService();
		model.addAttribute("pageTitle", "Tolkin Dewarfs");
		model.addAttribute("numOfthorinDewarfs", "13");
		model.addAttribute("dewarfs", dewarfService.getTolkinDewarfs());

		return "tolkin";
	}

}
