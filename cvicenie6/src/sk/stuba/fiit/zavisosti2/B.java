package sk.stuba.fiit.zavisosti2;

public class B extends A {

	public B() {
		super(2);
		System.out.println("Konstuktor B");
	}

	void m() {
		System.out.println("metoda m triedy B");
	}
	
	void m(int i) {
		System.out.println("metoda m triedy B");
	}
	
	static void sm() {
		
	}
	
}
