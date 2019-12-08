package sk.stuba.fiit.zoo;

public class Pes extends Zviera {

	public Pes(int hmotnost) {
		this.hmotnost = hmotnost;
		System.out.println("Som pes");
	}

	@Override
	public void zjedz(Kost k) {
		System.out.println("mnam kost");
		this.hmotnost++;
	}

	@Override
	public void zjedz(Seno s) {
		System.out.println("fuj seno nejem...");
		this.hmotnost--;
	}
	
	public void printHmotnost() {
		System.out.println("Som " + this.hmotnost + " kilogramovy pes");
	}

	@Override
	public void rozmnozovat() {

	}
	
}
