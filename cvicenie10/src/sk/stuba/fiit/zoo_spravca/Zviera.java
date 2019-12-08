package sk.stuba.fiit.zoo_spravca;

public abstract class Zviera implements Zijuci {
	protected int hmotnost;

	public abstract void zjedz(Kost k);
	public abstract void zjedz(Seno s);

	public void neabstraktnaMetoda() {

	}
}
