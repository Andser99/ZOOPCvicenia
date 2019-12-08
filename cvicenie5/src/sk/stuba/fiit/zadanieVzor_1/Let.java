package sk.stuba.fiit.zadanieVzor_1;

public class Let {
	Pilot hlavny;
	Letuska prva, druha;
	double trvanie;

	public Let(Pilot hlavny, Letuska prva, Letuska druha) {
		super();
		this.hlavny = hlavny;
		this.prva = prva;
		this.druha = druha;

	}
	
	@Override
	public String toString() {
		return "Let [hlavny=" + hlavny + ", prva=" + prva + ", druha=" + druha + "]";
	}
	
	
	public String vypis() {
		return " ";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilot p = new Pilot("Peter", "Odvazny", 33, 33);
		Letuska l1 = new Letuska("Alena", "Pekna", 25, 25);
		Letuska l2 = new Letuska("Petra", "Sikovna", 24, 24);
		
		Let nikam = new Let(p, l1, l2);
		
		System.out.println(nikam);
		

	}
}
