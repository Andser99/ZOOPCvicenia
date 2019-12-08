package sk.stuba.fiit.zoo_spravca;

public class Kost extends Potrava {
	void nakrm(Zviera z) {
		z.zjedz(this);
	}
}
