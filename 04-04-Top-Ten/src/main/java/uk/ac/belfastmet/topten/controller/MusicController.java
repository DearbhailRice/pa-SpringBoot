/**
 * 
 */
package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.topten.service.MusicService;

/**
 * @author ric19171870
 *
 */
@Controller
@RequestMapping
public class MusicController {

	@GetMapping("/")
	public String home(Model model) {

		return "index";

	}

	@GetMapping("/albums-chart")
	public String AlbumChart(Model model) {
		MusicService musicService = new MusicService();

		model.addAttribute("albums", musicService.getAlbums());
		return "albums-chart";

	}

	@GetMapping("/songs-chart")
	public String SongChart(Model model) {
		MusicService musicService = new MusicService();

		model.addAttribute("songs", musicService.getSongs());
		return "songs-chart";

	}
}
