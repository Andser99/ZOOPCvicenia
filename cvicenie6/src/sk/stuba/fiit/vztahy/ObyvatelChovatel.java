package sk.stuba.fiit.vztahy;import sk.stuba.fiit.bank.Account;import sk.stuba.fiit.bank.Bank;public class ObyvatelChovatel extends Clovek {	private DanovyUrad du;	private double danZaZviera;		public double vypocitajDan(int pocetZvierat) {		System.out.println("momentalne pocitam dan za mojich " + pocetZvierat + " zvierat");		return 0;	}		Account vytvorUcet(Bank b) {		return new Account(null, danZaZviera);	}		void uhradDane() {		//du.	}}