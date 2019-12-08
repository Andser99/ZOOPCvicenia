package sk.stuba.fiit.zoo_spravca;

public class Pes extends Zviera {
	Pes(int hmotnost) {
		this.hmotnost = hmotnost;
		System.out.println("Som " + this.hmotnost + "kilogramovy pes");
	}
	
	public void zjedz(Kost k) {
		System.out.println("Som pes. Mnam kost");
		this.hmotnost++;
	}
	
	public void zjedz(Seno s) {
		System.out.println("Som pes. Fuj seno...");
		this.hmotnost--;
	}	
	
	public void printHmotnost() {
		System.out.println("Som " + this.hmotnost + " kilograovy pes");
	}

	@Override
	public void rozmnozovat() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String predstavitSa() {
		return "Pes";
		
	}
}
