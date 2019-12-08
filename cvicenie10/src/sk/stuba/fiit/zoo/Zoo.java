package sk.stuba.fiit.zoo;

public class Zoo {

	public static void main(String[] args) {
		//new Zviera().zjedz(new Potrava());
		//new Potrava().nakrm(new Zviera());
		
		//new Krmenie(new Pes(), new Seno());
		//new Krmenie(new Krava(), new Kost());
		//new Krmenie(new Pes(), new Kost());
		
		Zviera p = new Pes(40);
		Zviera k = new Krava(300);
		Potrava s = new Seno();
		Potrava ko = new Kost();
		
		Pes pes = (Pes) p;
		Krava krava = (Krava) k;
		
		
		
		pes.printHmotnost();
		krava.printHmotnost();
		new Krmenie(p, s);
		new Krmenie(k, ko);
		new Krmenie(p, ko);
		pes.printHmotnost();
		krava.printHmotnost();
	
		
		
	
		
		
		
	}
}
