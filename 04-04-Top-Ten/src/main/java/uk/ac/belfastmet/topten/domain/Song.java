package uk.ac.belfastmet.topten.domain;

/**
 * 
 * @author ric19171870
 *
 */
public class Song extends Music {

	// instance vars
	private String album;
	private String songTitle;

	/**
	 * default constructor
	 */
	public Song() {

	}

	/**
	 * @param artists
	 * @param yearProduced
	 * @param currentRanking
	 * @param prevRanking
	 * @param album
	 * @param songTitle
	 */
	public Song(String artists, int yearProduced, int currentRanking, int prevRanking, String imagePath, String album,
			String songTitle) {
		super(artists, yearProduced, currentRanking, prevRanking, imagePath);
		this.album = album;
		this.songTitle = songTitle;
	}

	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}

	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}

	/**
	 * @return the songTitle
	 */
	public String getSongTitle() {
		return songTitle;
	}

	/**
	 * @param songTitle the songTitle to set
	 */
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	@Override
	public String toString() {
		return "Song [album=" + album + ", songTitle=" + songTitle + ", getArtists()=" + getArtists()
				+ ", getYearProduced()=" + getYearProduced() + ", getCurrentRanking()=" + getCurrentRanking()
				+ ", getPrevRanking()=" + getPrevRanking() + ", getImagePath()=" + getImagePath() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
