package sk.stuba.fiit.abstractt;

public class Metanol extends Potraviny {

	Metanol() {
		this.name = "Metanol";
	}

	@Override
	void doplnVitaminy(Obyvatel o) {
		o.silaZraku -= 100;
	}

	public String toString() {
		return super.toString() + this.name;
	}
}
