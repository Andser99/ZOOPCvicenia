package sk.stuba.fiit.zoo_spravca;

public class Macka extends Zviera {

	@Override
	public void zjedz(Kost k) {
		// TODO Auto-generated method stub
	}

	@Override
	public void zjedz(Seno s) {
		// TODO Auto-generated method stub
	}

	@Override
	public void rozmnozovat() {
		new Macka();
	}
	
	@Override
	public String predstavitSa() {
		return "Macka";	
	}
}
