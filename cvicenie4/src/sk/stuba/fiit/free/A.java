package sk.stuba.fiit.free;


public class A {
	
	int a = 1;
	
	public void finalize() { // de�truktor triedy sa vol� finalize
		System.out.println("Destruktor");
	}

}
