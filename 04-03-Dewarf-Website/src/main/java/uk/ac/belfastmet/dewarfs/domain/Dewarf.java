package uk.ac.belfastmet.dewarfs.domain;

public class Dewarf {
	
	private String name;
	private String author;
	private String image;
	
	//constructors 
	/**
	 * default constructor 
	 */
	public Dewarf() {
		
	}

	
	/**
	 * 
	 * @param name
	 * @param author
	 * @param image
	 */
	public Dewarf(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}


	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}


	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * to string method
	 */
	@Override
	public String toString() {
		return "Dewarf [name=" + name + ", author=" + author + ", image=" + image + "]";
	}
	
	
	
	
	
}
