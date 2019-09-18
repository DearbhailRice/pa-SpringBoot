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

	public ArrayList<Album> getAlbums() {

		this.albums = new ArrayList<Album>();

		albums.add(new Album("artists", 2019, 1, 2, "imagePath", "album1", "trackList,trackList,trackList"));
		albums.add(new Album("artists", 2019, 1, 2, "imagePath", "album2", "trackList,trackList,trackList"));
		albums.add(new Album("artists", 2019, 1, 2, "imagePath", "album3", "trackList,trackList,trackList"));
		return albums;

	}

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
