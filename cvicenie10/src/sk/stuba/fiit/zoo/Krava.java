package sk.stuba.fiit.zoo;

public class Krava extends Zviera {
	
	public Krava(int hmotnost) {
		this.hmotnost = hmotnost;
		System.out.println("Som krava");
	}

	@Override
	public void zjedz(Kost k) {
		System.out.println("fuj kosti nejem");
		this.hmotnost--;
	}

	@Override
	public void zjedz(Seno s) {
		System.out.println("mnam...");
		this.hmotnost++;
	}
	
	public void printHmotnost() {
		System.out.println("Som " + this.hmotnost + " kilogramova krava");
	}

	@Override
	public void rozmnozovat() {
		// TODO Auto-generated method stub
	}
}
