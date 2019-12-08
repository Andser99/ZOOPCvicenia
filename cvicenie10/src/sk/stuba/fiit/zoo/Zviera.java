package sk.stuba.fiit.zoo;

public abstract class Zviera implements Zijuci {
	int hmotnost;
	
	public void zjedz(Kost k) {
		System.out.println("Som zviera a kost mi chuti");
	}
	
	public void zjedz(Seno s) {
		System.out.println("Som zviera a seno mi chuti");
	}
}
