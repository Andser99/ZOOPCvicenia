package sk.stuba.fiit.free;


public class A {
	
	int a = 1;
	
	public void finalize() { // deštruktor triedy sa volá finalize
		System.out.println("Destruktor");
	}

}
