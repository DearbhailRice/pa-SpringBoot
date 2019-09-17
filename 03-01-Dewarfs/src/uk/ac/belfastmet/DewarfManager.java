package uk.ac.belfastmet;

import java.util.ArrayList;

public class DewarfManager {
	
	public static ArrayList <Dewarf>  disney = new ArrayList <Dewarf> ();
	public static ArrayList <Dewarf>  tolkin = new ArrayList <Dewarf> ();
	public static ArrayList <Dewarf>  allDewarfs = new ArrayList <Dewarf> ();
	
	public static void main(String [] args) {
		dewarfInitalizer();
		alldewarfsToArray();
		printDewarfDeats(allDewarfs);
	}
	
	public static void dewarfInitalizer() {
		Dewarf happy	 = new Dewarf("Happy", "Disney");
		Dewarf grumpy	 = new Dewarf("Grumpy", "Disney");
		Dewarf bashful	 = new Dewarf("Bashful", "Disney");
		Dewarf sleepy 	 = new Dewarf("Sleepy", "Disney");
		Dewarf dopey 	 = new Dewarf("Dopey", "Disney");
		Dewarf sneezy	 = new Dewarf("Sneezy", "Disney");
		Dewarf doc 		 = new Dewarf("Doc", "Disney");
		
		
		disney.add(sneezy);
		disney.add(dopey);
		disney.add(sleepy);
		disney.add(doc);
		disney.add(bashful);
		disney.add(grumpy);
		disney.add(happy);
		
		Dewarf  thorin 	= new Dewarf("Thorin","Tolkin");
		Dewarf  balin 	= new Dewarf("Balin","Tolkin");
		Dewarf  dwalin	= new Dewarf("Dwalin","Tolkin");
		Dewarf  fili	= new Dewarf("Fili","Tolkin");
		Dewarf  kili	= new Dewarf("Kili","Tolkin");
		Dewarf  dori	= new Dewarf("Dori","Tolkin");
		Dewarf  nori	= new Dewarf("Nori","Tolkin");
		Dewarf  oin		= new Dewarf("Oin","Tolkin");
		Dewarf  orin	= new Dewarf("Orin","Tolkin");
		Dewarf  gloin	= new Dewarf("Gloin","Tolkin");
		Dewarf  bifur	= new Dewarf("Bifur","Tolkin");
		Dewarf  bofur	= new Dewarf("Bofur","Tolkin");
		Dewarf  bombur	= new Dewarf("Bombur","Tolkin");
		
		
		
		tolkin.add(thorin);
		tolkin.add(balin);
		tolkin.add(dwalin);
		tolkin.add(fili);
		tolkin.add(kili);
		tolkin.add(dori);
		tolkin.add(nori);
		tolkin.add(oin);
		tolkin.add(orin);
		tolkin.add(gloin);
		tolkin.add(bifur);
		tolkin.add(bofur);
		tolkin.add(bombur);
		
	}
	
	public static ArrayList<Dewarf> alldewarfsToArray() {
		allDewarfs.addAll(disney);
		allDewarfs.addAll(tolkin);
		
		return allDewarfs;
		
	}
	
	public static void printDewarfDeats (ArrayList<Dewarf> dewarfs) {
		for(Dewarf dewarf: dewarfs) {
			dewarf.printDetails();
		}
	}
}
