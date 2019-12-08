package sk.stuba.fiit.free;

public class Hlavna {
	
		public static void main(String[] args) {
			A a1 = new A();
			A a2 = new A();
			
			System.out.println(a1);

			a1 = a2; // ???
			System.out.println(a1);
			a1.finalize();
			a2.finalize();
			System.out.println(a1);
			System.out.println(a2);
		}
	}
