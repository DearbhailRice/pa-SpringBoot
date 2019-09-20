/**
 * 
 */
package uk.ac.belfastmet.topten.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.topten.service.MusicService;

/**
 * @author ric19171870 controller class directs around the website, needs
 *         methods to move around the website
 */
@Controller
@RequestMapping
public class MusicController {
	// must have return statement with get request
	// post request does not require return

	Logger log = LoggerFactory.getLogger(MusicController.class);

	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome(Model model) {
		log.info("ON Index PAGE");

		return "index";

	}

	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/albums-chart", method = RequestMethod.GET)
	public String getAlbumChart(Model model) {
		MusicService musicService = new MusicService();
		log.info("ON ALBUMS PAGE ");

		model.addAttribute("albums", musicService.getAlbums());
		log.info(musicService.getAlbums().toString());
		return "albums-chart";

	}

	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/songs-chart", method = RequestMethod.GET)
	public String getSongChart(Model model) {
		MusicService musicService = new MusicService();
		log.info("ON SONGS PAGE");
		model.addAttribute("songs", musicService.getSongs());
		log.info(musicService.getSongs().toString());
		return "songs-chart";

	}
}
