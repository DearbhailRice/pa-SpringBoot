package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toystorymovie")
public class ToyStoryController {

	@GetMapping()
	public String home() {
		return "Characters in the Toystory movie";
	}
	
	@GetMapping("/woody")
	public String woody() {
		return"Woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz was played by Tim Allen";
	}
	
	@GetMapping("/little-bo-peep")
	public String littleBoPeep() {
		return " Little Bo peep was played by Annie Potts";
	}
	
	@GetMapping("/Mr-Potato-Head")
	public String mrPotatoHead() {
		return "Mr Poatao Head was played by Don Rickles";
	}
	
	@GetMapping("/rex")
	public String rex() {
		return "Rex was played by Wallace Shawn";
	}
	
	@GetMapping("/hamm")
	public String hamm() {
		return "Hamm was played by John Ratzenberger ";
	}
	
		
		
}
