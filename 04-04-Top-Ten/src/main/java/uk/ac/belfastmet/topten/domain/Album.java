/**
 * 
 */
package uk.ac.belfastmet.topten.domain;

/**
 * @author ric19171870
 *
 */
public class Album extends Music {

	private String album;
	private String trackList;

	/**
	 * default constructor
	 */
	public Album() {

	}

	/**
	 * @param artists
	 * @param yearProduced
	 * @param currentRanking
	 * @param prevRanking
	 * @param album
	 * @param trackList
	 */
	public Album(String artists, int yearProduced, int currentRanking, int prevRanking, String imagePath, String album,
			String trackList) {
		super(artists, yearProduced, currentRanking, prevRanking, imagePath);
		this.album = album;
		this.trackList = trackList;
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
	 * @return the trackList
	 */
	public String getTrackList() {
		return trackList;
	}

	/**
	 * @param trackList the trackList to set
	 */
	public void setTrackList(String trackList) {
		this.trackList = trackList;
	}

	@Override
	public String toString() {
		return "Album [album=" + album + ", trackList=" + trackList + ", getArtists()=" + getArtists()
				+ ", getYearProduced()=" + getYearProduced() + ", getCurrentRanking()=" + getCurrentRanking()
				+ ", getPrevRanking()=" + getPrevRanking() + ", getImagePath()=" + getImagePath() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
