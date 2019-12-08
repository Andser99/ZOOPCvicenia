package sk.stuba.fiit.zoo_spravca;

import java.util.ArrayList;

public class SpravcaZvierat {
	ArrayList<Zijuci> zijuci = new ArrayList<>();
	
	public void acceptAnimal(Zviera z) {
		zijuci.add(z);
	}
	
	public String getZoznamZiverat() {
		String s = "";
		for(Zijuci mz: zijuci) {
			s += mz.predstavitSa() + "\n";
		}	
		return s;
	}
}
