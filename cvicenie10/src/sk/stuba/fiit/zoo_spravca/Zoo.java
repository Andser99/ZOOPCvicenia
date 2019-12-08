package sk.stuba.fiit.zoo_spravca;

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

		
		new Krmenie(p, s);
		new Krmenie(z, k);
		new Krmenie(p, k);
		
	
		pes.printHmotnost();
		krava.printHmotnost();
		
		SpravcaZvierat sz = new SpravcaZvierat();
		
		sz.acceptAnimal(pes);
		sz.acceptAnimal(krava);
		sz.acceptAnimal(krava);
		sz.acceptAnimal(krava);
		sz.acceptAnimal(krava);
		sz.acceptAnimal(krava);
		
		System.out.println(sz.getZoznamZiverat());
		
	}

}
