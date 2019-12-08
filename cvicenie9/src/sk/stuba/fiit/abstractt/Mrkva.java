package sk.stuba.fiit.abstractt;

public class Mrkva extends Potraviny {
	
	Mrkva() {
		this.name = "Mrkva";
	}
	@Override
	void doplnVitaminy(Obyvatel o) {
		o.silaZraku++;	
	}
	
	public String toString() {
		return super.toString() + this.name;
	}
	
}
