package uk.ac.belfastmet;

public class Dewarf {
	
	//instance vars 
	private String name;
	private String author;
	
	//constructor
	/**
	 * default constructor 
	 */
	public Dewarf() {
		
	}

	/**
	 * consructor with args 
	 * @param name
	 * @param author
	 */
	public Dewarf(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	
	//getters and setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void printDetails() {
		System.out.println(this.name+"\t\t"+ this.author );
	}
	
}
