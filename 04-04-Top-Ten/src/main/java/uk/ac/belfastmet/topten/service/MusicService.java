/**
 * 
 */
package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;

import uk.ac.belfastmet.topten.domain.Album;
import uk.ac.belfastmet.topten.domain.Song;

/**
 * @author ric19171870
 *
 */
public class MusicService {

	private ArrayList<Album> albums;
	private ArrayList<Song> songs;

	/**
	 * method to create albums and assign to albums array list
	 * 
	 * @return
	 */
	public ArrayList<Album> getAlbums() {

		this.albums = new ArrayList<Album>();

		// constructor order String artists, int yearProduced, int currentRanking, int
		// prevRanking, String imagePath, String album,String trackList

		albums.add(new Album("artists1", 2019, 1, 3, "one.jpg", "album1", "1trackList,trackList,trackList"));
		albums.add(new Album("artists2", 2019, 2, 2, "two.png", "album2", "2trackList,trackList,trackList"));
		albums.add(new Album("artists3", 2019, 3, 1, "three.jpg", "album3", "3trackList,trackList,trackList"));
		return albums;

	}

	/**
	 * method to creatre songs and assign to songs array list
	 * 
	 * @return
	 */
	public ArrayList<Song> getSongs() {
		this.songs = new ArrayList<Song>();

		/**
		 * String artists, int yearProduced, int currentRanking, int prevRanking, String
		 * imagePath, String album, String songTitle
		 */
		songs.add(new Song("artists", 2019, 1, 2, "imagePath", "album", "songTitle1"));
		songs.add(new Song("artists", 2019, 1, 2, "imagePath", "album", "songTitle1"));
		songs.add(new Song("artists", 2019, 1, 2, "imagePath", "album", "songTitle1"));

		return songs;
	}

}
