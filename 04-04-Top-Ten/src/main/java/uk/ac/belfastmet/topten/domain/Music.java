/**
 * 
 */
package uk.ac.belfastmet.topten.domain;

/**
 * @author ric19171870
 *
 */
public abstract class Music {

	private String artists;
	private int yearProduced;
	private int currentRanking;
	private int prevRanking;
	private String imagePath;

	/**
	 * default constructor
	 */
	public Music() {

	}

	/**
	 * @param artists
	 * @param yearProduced
	 * @param currentRanking
	 * @param prevRanking
	 */
	public Music(String artists, int yearProduced, int currentRanking, int prevRanking, String imagePath) {
		super();
		this.artists = artists;
		this.yearProduced = yearProduced;
		this.currentRanking = currentRanking;
		this.prevRanking = prevRanking;
		this.imagePath = imagePath;
	}

	/**
	 * @return the artists
	 */
	public String getArtists() {
		return artists;
	}

	/**
	 * @param artists the artists to set
	 */
	public void setArtists(String artists) {
		this.artists = artists;
	}

	/**
	 * @return the yearProduced
	 */
	public int getYearProduced() {
		return yearProduced;
	}

	/**
	 * @param yearProduced the yearProduced to set
	 */
	public void setYearProduced(int yearProduced) {
		this.yearProduced = yearProduced;
	}

	/**
	 * @return the currentRanking
	 */
	public int getCurrentRanking() {
		return currentRanking;
	}

	/**
	 * @param currentRanking the currentRanking to set
	 */
	public void setCurrentRanking(int currentRanking) {
		this.currentRanking = currentRanking;
	}

	/**
	 * @return the prevRanking
	 */
	public int getPrevRanking() {
		return prevRanking;
	}

	/**
	 * @param prevRanking the prevRanking to set
	 */
	public void setPrevRanking(int prevRanking) {
		this.prevRanking = prevRanking;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
