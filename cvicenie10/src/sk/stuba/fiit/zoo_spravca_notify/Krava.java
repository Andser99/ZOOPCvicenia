package sk.stuba.fiit.zoo_spravca_notify;

import java.util.ArrayList;

public class Krava extends Zviera {
	ArrayList<Zodpoveni> pomocnik = new ArrayList<>();
		
	Krava(int hmotnost) {
		this.hmotnost = hmotnost;
		System.out.println("Som " + this.hmotnost + " kilograova krava");
	}
	
	public void pridajZodpovedneho(Zodpoveni z) {
		this.pomocnik.add(z);
	}
	
	public void odoberZodpovedneho(Zodpoveni z) {
		
	}
	
	public void upovedom() {
		for(Zodpoveni z: pomocnik)
			z.hlasProblem();
	}
	
	public void zjedz(Kost k) {
		System.out.println("Som krava. Fuj kost");
		this.hmotnost--;
		this.upovedom();
	}
	
	public void zjedz(Seno s) {
		System.out.println("Som krava. Mnam seno...");
		this.hmotnost++;
	}	
	
	public void printHmotnost() {
		System.out.println("Som " + this.hmotnost + " kilograova krava");
	}
	
	public void neabstraktnaMetoda() {

	}

	@Override
	public void rozmnozovat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String predstavitSa() {
		return "Krava";
		
	}
	
}
