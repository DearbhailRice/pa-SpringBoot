package uk.ac.belfastmet.dewarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dewarfs.service.DewarfService;

@Controller
@RequestMapping
public class DewarfController {

	@GetMapping()
	public String homePage() {
		return "index";
	}

	@GetMapping("/disney")
	public String disney(Model model) {

		DewarfService dewarfService = new DewarfService();
		model.addAttribute("pageTitle", "Disney Dewarfs ");
		model.addAttribute("numOfDewarfs", "7");
		model.addAttribute("dewarfs", dewarfService.getDisneyDewarfs());

		// ;

		return "disney";
	}

	@GetMapping("/tolkin")
	public String tolkin(Model model) {
		DewarfService dewarfService = new DewarfService();
		model.addAttribute("pageTitle", "Tolkin Dewarfs");
		model.addAttribute("numOfthorinDewarfs", "13");
		model.addAttribute("dewarfs", dewarfService.getTolkinDewarfs());

		return "tolkin";
	}

}
