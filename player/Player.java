/**
 * 
 */
package player;


import java.util.ArrayList;

/**
 * @author dearb
 *
 */
public class Player {
	
	/**
	 * name 
	 */
	private String name;
	
	
	/**
	 * inital balance set to inital balance 
	 */
	private int balance;
	
	/**
	 * set to players postion on board 
	 */
	private int position;
	
	private ArrayList <board.Area> propertiesOwned = new ArrayList <board.Area>();
	/**
	 * default constructor
	 */
	public Player() {
		
	}

	/**
	 * @param name
	 * @param balance
	 * @param position
	 */
	public Player(String name, int balance, int position) {
		this.setName(name);
		this.setBalance(balance); 
		this.setPosition(position);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 
	 * @param name the name to set
	 */
	
	public void setName(String name) throws IllegalArgumentException {
		
		if (name == null ) {
			System.out.println("please enter a name");
			throw new IllegalArgumentException("name value is null");
		}else if (name.length()<=2){
			System.out.println("Please enter a name  more than two characters long  ");
			throw new IllegalArgumentException("name value is null");
		}else if (name.length()>20) {
			System.out.println("Please enter a name less than twenty characters long ");
			throw new IllegalArgumentException("name value is null");
		}else if  ((name.length()<20)&&(name.length()>2)) {
			this.name = name;
		}
		
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) throws IllegalArgumentException {
		if(balance>0) {
			this.balance = balance;
		}else if (balance == 0 ) {
			System.out.println("Insufficient funds balnce equals Zero ");
			
		}else {
			System.out.println("Insufficient funds balnce will be come less than Zero ");
			throw new IllegalArgumentException("balance lesst than zero");
		}
		
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) throws IllegalArgumentException{
		if ((position>=1)&&(position<=16)) {
			this.position = position;
		}
		else if (position <1) {
			throw new IllegalArgumentException("position too low");
		}else if (position >16) {
			throw new IllegalArgumentException("position too high ");
		}
		
	}
	
	/**
	 * @return the propertiesOwned
	 */
	public ArrayList<board.Area> getPropertiesOwned() {
		return propertiesOwned;
	}

	/**
	 * @param property the propertiesOwned to set
	 */
	public void setPropertiesOwned(ArrayList<board.Area> propertiesOwned) {
		this.propertiesOwned = propertiesOwned;
	}

	public  void  addToBalance( int amount) {
		this.balance=( balance+amount );
		
		
	}
	
	public void SubtractFromBalance(  int amount  ) {
		
		if (( balance-amount)>=0) {
			this.balance=( balance-amount);
		}else {
			System.out.println("Insufficient Funds for Transaction ");
			//needed to add more here
		}
		
		
	}
	
	public void PrintAllProperties() {
		if(propertiesOwned.size()>0) {
			for(int count = 0 ; count < propertiesOwned.size(); count ++) {
				System.out.println("position : "+propertiesOwned.get(count).getPosition()+"\t Property Name : "+propertiesOwned.get(count).getName()+" \t area : "+ propertiesOwned.get(count).getType()+"\t total current rent "+ propertiesOwned.get(count).calculateRent()
						+ "\t sale Value "+ propertiesOwned.get(count).getValue());
			}
		}else if (propertiesOwned.size()==0){
			System.out.println("You do not have any properties yet ");
		}
		
	}
	
	public void displayAll () {
		System.out.println("Name : "+getName()+ "\t Balance : "+ getBalance()+ "\t Position : " + getPosition());
		System.out.println("Properties owned: ");
		PrintAllProperties();
		System.out.println("\n \n");
	}
	
	
	
	

}
