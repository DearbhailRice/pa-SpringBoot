package uk.ac.belfastmet;

import java.util.ArrayList;

/**
 * @author ric19171870
 *
 */

public class Main {

	//constant Arrays for dewarfs/ves
	public static ArrayList <String> dewarfs = new ArrayList <String>();
	public static ArrayList <String> dewarves = new ArrayList <String>();
	
	
	public static void main(String[] args) {
		
		addSnowWhiteDewarfNames();
		addtolkinDewarvesNames();
		
		printDewarfNames(dewarfs);
		printDewarfNames(dewarves);
		
	}
	
	/*
	 * method to add the seven snow white dewarfs to the dewarfs array 
	 */
	public static void addSnowWhiteDewarfNames() {
		
		dewarfs.add("Happy");
		dewarfs.add("Sleepy");
		dewarfs.add("Dopey");
		dewarfs.add("Bashful");
		dewarfs.add("Sneezy");
		dewarfs.add("Grumpy");
		dewarfs.add("Doc");
		
		
	}
	
	/*
	 * method to add the 13 tolkin dewarves to the dewarves array 
	 */
	public static void addtolkinDewarvesNames() {
		
		dewarves.add("Thorin");
		dewarves.add("Balin");
		dewarves.add("Dwalin");
		dewarves.add("Fili");
		dewarves.add("Kili");
		dewarves.add("Dori");
		dewarves.add("Nori");
		dewarves.add("Oin");
		dewarves.add("Orin");
		dewarves.add("Gloin");
		dewarves.add("Bifur");
		dewarves.add("Bofur");
		dewarves.add("Bombur");


	}
	
	/**
	 * 
	 * @param dewarf
	 */
	public static void printDewarfNames(ArrayList <String> dewarf) {
		
			
			if (dewarf.contains("Happy")) {
				for (String d: dewarf) {
				System.out.println("snow white knows a dewarf called "+ d);
				}
				System.out.println();
			}else if (dewarf.contains("Thorin")) {
				for (String d: dewarf) {
					System.out.println("Thorins company contains a dewarf called "+ d);
				}
				System.out.println();
			}
			
		}
	}

