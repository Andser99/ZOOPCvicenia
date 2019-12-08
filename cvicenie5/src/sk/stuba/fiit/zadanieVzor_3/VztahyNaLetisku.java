package sk.stuba.fiit.zadanieVzor_3;

import java.util.ArrayList;

public class VztahyNaLetisku {
	
	static int cas = 0;

	public static void main(String[] args) {
		
		/*
		 * vytvorím cyklus od 1 do 24 ak keby jeden den tym budem simulovat po hodinach
		 * Vytvorim pole letov a budem informovat o volnej drahe a case
		 * Lietadla budu odlietat
		 * 
		 */

		ArrayList<Let> ar = new ArrayList();
		
		ar.add(new Let("PO01", new Pilot("Peter", "Rychly", 35, 52), new Letuska("Alena", "Pekna", 23, 3), new Letuska("Petra", "Sikovna", 21, 2) ));
		ar.add(new Let("KE88", new Pilot("Peter", "Rychly", 35, 52), new Letuska("Alena", "Pekna", 23, 3), new Letuska("Petra", "Sikovna", 21, 2) ));
		ar.add(new Let("SN72", new Pilot("Peter", "Rychly", 35, 52), new Letuska("Alena", "Pekna", 23, 3), new Letuska("Petra", "Sikovna", 21, 2) ));

		for(Let planovaneLety: ar) {
			//this.cas++;
			cas++;
			System.out.println("Aktualny cas: " + cas + " " + planovaneLety);
		}	
		
		ar.remove(1);
		
		for(Let planovaneLety: ar) {
			//this.cas++;
			cas++;
			System.out.println("Aktualny cas: " + cas + " " + planovaneLety);
		}	
		
		//ar.get(1).setPorucha(true);
		
	}
}
