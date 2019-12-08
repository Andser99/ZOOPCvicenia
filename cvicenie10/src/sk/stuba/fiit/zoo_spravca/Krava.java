package sk.stuba.fiit.zoo_spravca;

public class Krava extends Zviera {
	Krava(int hmotnost) {
		this.hmotnost = hmotnost;
		System.out.println("Som " + this.hmotnost + " kilograova krava");
	}
	
	public void zjedz(Kost k) {
		System.out.println("Som krava. Fuj kost");
		this.hmotnost--;
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
