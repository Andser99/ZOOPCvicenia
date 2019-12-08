package sk.stuba.fiit.skladanievsdedenie;

public class A extends C {
	B b = new B();
	C c;
	String s;
		
	void pouziSucet() {
		System.out.println(b.sucet());
	}
	
	int sucin() {
		return this.hodnota_a * this.hodnota_b;
	}
	
	void nm() {
		
	}
	
	int sucet() {
		return hodnota_a + hodnota_b * 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A().pouziSucet();
		//new C().nm
		
	}
}
