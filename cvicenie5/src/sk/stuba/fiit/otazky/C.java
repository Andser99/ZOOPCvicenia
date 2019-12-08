package sk.stuba.fiit.otazky;

public class C {

	A a = new A();
	B b = new B();

	public A getA() {
		
		this.b.m();
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A b;

		b = a;
	}

}
