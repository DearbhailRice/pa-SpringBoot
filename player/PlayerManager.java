/**
 * 
 */
package player;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//add thread.sleep
/**
 * @author dearb
 *
 */
public class PlayerManager extends Player {
	private static ArrayList<Player> players = new ArrayList<Player>();
	private static final int Inital_Position = 1;
	private static final int Inital_balance = 200;
	private static final int min_Num_Players = 2;
	private static final int max_Num_Players = 4;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner playerNumScan = new Scanner(System.in);
		Scanner nameScan = new Scanner(System.in);

		welcomeMessage();

		createPlayer(players, nameScan, selectNumofPlayers(playerNumScan));

		ensureNameChangeNoRep(players, nameScan);

		System.out.println("\n \n");

		printPlayerDetails(players);

		if (players.size() > 1) {
			confirmPlayersCorrect(players, nameScan);
		}

		returnPlayerArray();

		// playerNumScan.close();
		// nameScan.close();
	}

	/**
	 * method to print a welcome method to screen
	 */
	public static void welcomeMessage() {
		System.out.println("Welcome to Technopoly ");
		System.out.println(
				"The Technology based Monopoly Game for " + min_Num_Players + "-" + max_Num_Players + " players");
		System.out.println("Lets begin...");
		System.out.println();
	}

	/**
	 * method to seect the number of players between 2 & 4
	 * 
	 * @param scanner
	 * @return
	 */
	public static int selectNumofPlayers(Scanner scanner) {
		int numOfPlayers = 0;

		boolean validInput= false;

			
			try {
			do {
				System.out.println("Please enter a  number of players between " + min_Num_Players + " and "
						+ max_Num_Players + ". \n ");
				if (scanner.hasNext()) {
					
					numOfPlayers = scanner.nextInt();

					if ((numOfPlayers >= min_Num_Players) && (numOfPlayers <= max_Num_Players)) {
						System.out.println("you have selected " + numOfPlayers + " player game \n ");
						validInput=true;
						return numOfPlayers;
					} else if ((numOfPlayers < min_Num_Players) && (numOfPlayers > max_Num_Players)) {

						System.out.println("Please enter a number of players between " + min_Num_Players + " and "
								+ max_Num_Players + ". \n \n");
						validInput=false;
					} else {
					System.out.println("Please enetr a valid whole number between 1 & 4 ");
					validInput=false;
				}
				}
			} while (!validInput);

		} catch (Exception exc ) {
			System.out.println("Error please enter whole numbers only. \n Please restart the game ");
			System.exit(0);
		}
		return 0;
	}

	/**
	 * method to set the players name and assign the players to an array
	 * 
	 * @param players
	 * @param scanner
	 * @param numOfPlayers
	 */
	public static void createPlayer(ArrayList<Player> players, Scanner scanner, int numOfPlayers) {
		try {
			if ((numOfPlayers >= min_Num_Players) && (numOfPlayers <= max_Num_Players)) {

				for (int count = 1; count <= numOfPlayers; count++) {
					System.out.println("Please enter player " + count + "s name");
					String name;

					if (count == 1) {
						Player player1 = new Player();
						name = scanner.nextLine();
						player1.setName(name);
						player1.setBalance(Inital_balance);
						player1.setPosition(Inital_Position);

						if (players.size() < numOfPlayers) {
							players.add(player1);
						} else {
							System.out.println("Too Many players");
						}
					} else if (count == 2) {
						Player player2 = new Player();
						name = scanner.nextLine();
						player2.setName(name);
						player2.setBalance(Inital_balance);
						player2.setPosition(Inital_Position);

						if (players.size() < numOfPlayers) {
							players.add(player2);
						} else {
							System.out.println("Too Many players");
						}
					} else if (count == 3) {

						Player player3 = new Player();
						name = scanner.nextLine();
						player3.setName(name);
						player3.setBalance(Inital_balance);
						player3.setPosition(Inital_Position);

						if (players.size() < numOfPlayers) {
							players.add(player3);
						} else {
							System.out.println("Too Many players");
						}
					} else if (count == 4) {
						name = scanner.nextLine();
						Player player4 = new Player();
						player4.setName(name);
						player4.setBalance(Inital_balance);
						player4.setPosition(Inital_Position);

						if (players.size() < numOfPlayers) {
							players.add(player4);
						} else {
							System.out.println("Too Many players");
						}
					}
				}

			}
		} catch (InputMismatchException exc) {
			System.out.println("something went wrong ");
			createPlayer(players, scanner, numOfPlayers);
		} catch (IllegalArgumentException iae) {
			System.out.println("something went wrong ");
			createPlayer(players, scanner, numOfPlayers);

		}
	}

	/**
	 * method to check the players names entered arenot the same
	 * 
	 * @param players
	 * @param scanner
	 */
	public static void checkNames(ArrayList<Player> players, Scanner scanner) {

		for (int loop = 0; loop < players.size(); loop++) {

			for (int check = 0; check < players.size(); check++) {

				if (check != loop) {

					if (players.get(loop).getName().equals(players.get(check).getName())) {

						System.out
								.println("Player " + (loop + 1) + " and Player " + (check + 1) + " have the same name");
						System.out.println("please change player " + (loop + 1) + "s name");
						players.get(loop).setName(scanner.next());
					}
				} else {
					continue;
				}
			}

		}

	}

	/**
	 * prints players details to screen
	 * 
	 * @param players
	 */
	public static void printPlayerDetails(ArrayList<Player> players) {
		for (int loop = 0; loop < players.size(); loop++) {

			System.out.println("Player " + (loop + 1) + "s ...");
			players.get(loop).displayAll();

		}

	}

	/**
	 * method to double check that a player prompted to change there name has not
	 * entered the same name as another player again
	 * 
	 * @param players
	 * @param nameScan
	 */
	public static void ensureNameChangeNoRep(ArrayList<Player> players, Scanner nameScan) {
		for (int loop = 0; loop < players.size(); loop++) {
			checkNames(players, nameScan);
		}
	}

	/**
	 * allows players to double check their names are correct
	 * 
	 * @param players
	 * @param scanner
	 */
	public static void confirmPlayersCorrect(ArrayList<Player> players, Scanner scanner) {

		boolean validinput;
		do {
			System.out.println(" \n"
					+ "please confirm the players names are correct by entering Y for yes or N for no followed by the enter key ");
			String Input = scanner.next();
			if (Input.equalsIgnoreCase("Y")) {
				System.out.println("players Ready! \n Lets get started...");
				validinput = true;
			} else if (Input.equalsIgnoreCase("n")) {
				System.out.println(
						"Ok please enter the player number who's name you wish to change followed by the enter key");
				int playerNum = scanner.nextInt();
				int index = playerNum - 1;

				if (index <= (players.size() - 1)) {
					System.out.println("Ok please enter the new name followed by the enter key ");
					String name = scanner.next();
					players.get(index).setName(name);
					checkNames(players, scanner);
					printPlayerDetails(players);
					System.out.println("\n players Ready! \n Lets get started...");
					validinput = true;
				} else {
					System.out.println("Sorry that number doesn't seem quite right");
					validinput = false;
					scanner.reset();
				}

			} else {
				System.out.println("Sorry please enter 'Y' or 'N' only ");
				validinput = false;
				scanner.reset();
			}
		} while (!validinput);
	}

	/**
	 * returns the player array list for use in other methods
	 * 
	 * @return
	 */
	public static ArrayList<Player> returnPlayerArray() {

		return players;
	}

}
