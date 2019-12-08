package sk.stuba.fiit.zoo_spravca_notify;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Zviera().zjedz(new Potrava());
		//new Potrava().nakrm(new Zviera());

		// new Krmenie(new Pes(), new Seno());
		// new Krmenie(new Krava(), new Kost());
		// new Krmenie(new Pes(), new Kost());

		Zviera p = new Pes(40);
		Zviera z = new Krava(300);
		Potrava s = new Seno();
		Potrava k = new Kost();
		
		

		Pes pes = (Pes) p;
		Krava krava = (Krava) z;
		
		pes.printHmotnost();
		krava.printHmotnost();

		SpravcaZvierat sz = new SpravcaZvierat();
		krava.pridajZodpovedneho(sz);
		
		
		new Krmenie(p, s);
		new Krmenie(z, k);
		new Krmenie(p, k);
		
	
		pes.printHmotnost();
		krava.printHmotnost();
		

		
		sz.acceptAnimal(pes);
		sz.acceptAnimal(krava);
		sz.acceptAnimal(krava);
		sz.acceptAnimal(krava);
		sz.acceptAnimal(krava);
		sz.acceptAnimal(krava);
		
		System.out.println(sz.getZoznamZiverat());
		
	}

}
