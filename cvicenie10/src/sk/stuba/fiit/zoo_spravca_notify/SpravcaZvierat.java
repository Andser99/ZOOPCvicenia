package sk.stuba.fiit.zoo_spravca_notify;

import java.util.ArrayList;

public class SpravcaZvierat implements Zodpoveni {
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

	@Override
	public void hlasProblem() {
		// TODO Auto-generated method stub
		System.out.println("SpravcaZvierat: ...hlaseny mi je problem s kravou. Idem na to...");
	}
	
	
}
