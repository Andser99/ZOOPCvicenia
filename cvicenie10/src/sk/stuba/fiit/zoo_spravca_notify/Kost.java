package sk.stuba.fiit.zoo_spravca_notify;

public class Kost extends Potrava {
	void nakrm(Zviera z) {
		z.zjedz(this);
	}
}
