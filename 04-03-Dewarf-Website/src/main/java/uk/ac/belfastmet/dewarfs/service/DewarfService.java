/**
 * 
 */
package uk.ac.belfastmet.dewarfs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dewarfs.domain.Dewarf;

/**
 * @author ric19171870
 *
 */

@Service
public class DewarfService {
		
	private ArrayList <Dewarf> disneyDewarfs; 
	private ArrayList <Dewarf> tolkinDewarfs; 
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Dewarf> getDisneyDewarfs(){
		this.disneyDewarfs= new ArrayList<Dewarf>();
		
		this.disneyDewarfs.add(new Dewarf("Sleepy", "Disney","sleepy.png"));
		this.disneyDewarfs.add(new Dewarf("Dopey", "Disney","dopey.png"));
		this.disneyDewarfs.add(new Dewarf("Happy", "Disney","happy.png"));
		this.disneyDewarfs.add(new Dewarf("Bashful", "Disney","bashful.png"));
		this.disneyDewarfs.add(new Dewarf("Grumpy", "Disney","grumpy.png"));
		this.disneyDewarfs.add(new Dewarf("Doc", "Disney","doc.png"));
		this.disneyDewarfs.add(new Dewarf("Sneezy", "Disney","sneezy.png"));
		return this.disneyDewarfs;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Dewarf> getTolkinDewarfs(){
		this.tolkinDewarfs= new ArrayList<Dewarf>();
		
		this.disneyDewarfs.add(new Dewarf("Thorin", "Tolkin","thorin.png"));
		this.disneyDewarfs.add(new Dewarf("Balin", "Tolkin","balin.png"));
		this.disneyDewarfs.add(new Dewarf("Dwalin", "Tolkin","dwalin.png"));
		this.disneyDewarfs.add(new Dewarf("Fili", "Tolkin","fili.png"));
		this.disneyDewarfs.add(new Dewarf("Kili", "Tolkin","kili.png"));
		this.disneyDewarfs.add(new Dewarf("Dori", "Tolkin","dori.png"));
		this.disneyDewarfs.add(new Dewarf("Nori", "Tolkin","nori.png"));
		this.disneyDewarfs.add(new Dewarf("Oin", "Tolkin","oin.png"));
		this.disneyDewarfs.add(new Dewarf("Orin", "Tolkin","orin.png"));
		this.disneyDewarfs.add(new Dewarf("Gloin", "Tolkin","gloin.png"));
		this.disneyDewarfs.add(new Dewarf("Bifur", "Tolkin","bifur.png"));
		this.disneyDewarfs.add(new Dewarf("Bofur", "Tolkin","bofur.png"));
		this.disneyDewarfs.add(new Dewarf("Bombur", "Tolkin","bombur.png"));
		
	
		
		return this.tolkinDewarfs;
	}
}
