package uk.ac.belfastmet.toystory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
@RequestMapping()
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

	/*
	 * @GetMapping("/") public String () { return " was played by "; }
	 */
}