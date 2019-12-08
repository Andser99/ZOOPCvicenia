package sk.stuba.fiit.upcasting;

public class Main {

	public static void main(String[] args) {
		//A a = new A();
		B b = new B();
				
		A ab = new B();
		
		ab.m();
		ab.ma();
		
		b.ma();

	}

}
