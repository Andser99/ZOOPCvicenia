package sk.stuba.fiit.abstractt;

public class Paprika extends Potraviny {

	Paprika() {
		this.name = "Paprika";
	}

	@Override
	void doplnVitaminy(Obyvatel o) {
		o.silaZraku++;
	}

	public String toString() {
		return super.toString() + this.name;
	}

}
