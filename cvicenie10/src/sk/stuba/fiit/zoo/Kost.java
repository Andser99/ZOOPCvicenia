package sk.stuba.fiit.zoo;

public class Kost extends Potrava {
	public void nakrm(Zviera z) {
		//System.out.println("Zviera z je nakrmene");
		z.zjedz(this);
	}
}
