package sk.stuba.fiit.zadanieVzor_2;

import java.util.ArrayList;

public class VztahyNaLetisku {
	
	static int cas = 0;

	public static void main(String[] args) {
		
		/*
		 *  cyklus od 1 do 24 ako keby jeden den simulovany po hodinach
		 *  pole letov 
		 *  informovat o volnej drahe a case
		 *  Lietadla budu odlietat
		 * 
		 */

		ArrayList<Let> ar = new ArrayList();
		
		ar.add(new Let(new Pilot("Peter", "Rychly", 35, 52), new Letuska("Alena", "Pekna", 23, 3), new Letuska("Petra", "Sikovna", 21, 2) ));
		ar.add(new Let(new Pilot("Peter", "Rychly", 35, 52), new Letuska("Alena", "Pekna", 23, 3), new Letuska("Petra", "Sikovna", 21, 2) ));
		ar.add(new Let(new Pilot("Peter", "Rychly", 35, 52), new Letuska("Alena", "Pekna", 23, 3), new Letuska("Petra", "Sikovna", 21, 2) ));

		for(Let planovaneLety: ar) {
			//this.cas++;
			cas++;
			System.out.println("Aktualny cas: " + cas + " " + planovaneLety);
			System.out.println(ar.size());
		}
	}
}
