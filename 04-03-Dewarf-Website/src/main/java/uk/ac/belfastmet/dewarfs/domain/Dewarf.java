package uk.ac.belfastmet.dewarfs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author ric19171870
 *
 */
@Entity
@Table(name ="dewarf_people")
public class Dewarf {
	
	//instance vars 
	private String name;
	private String author;
	private String image;
	private long dewarfId;
	
	
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
	@Column (name= "name")
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
	@Column(name="author")
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
	@Column(name = "image_path")
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
	 * @return the dewarfId
	 */
	@Id
	@Column(name="id_dewarf_people")
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public long getDewarfId() {
		return dewarfId;
	}


	/**
	 * @param dewarfId the dewarfId to set
	 */
	public void setDewarfId(long dewarfId) {
		this.dewarfId = dewarfId;
	}

	/**
	 * to string method
	 */
	@Override
	public String toString() {
		return "Dewarf [name=" + name + ", author=" + author + ", image=" + image + "]";
	}



	
	
	
	
	
}
