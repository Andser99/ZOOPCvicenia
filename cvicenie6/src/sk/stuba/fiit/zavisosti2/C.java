package sk.stuba.fiit.zavisosti2;

public class C extends B {

	public C() {
		super.m();
		super.i++;
		System.out.println("Konstuktor C");
	}
	void m() {
		System.out.println("metoda m triedy B");
	}
	
	//public final void mf() { }
	
	
	
	public void m(int i, int j) {
		
	}
}
