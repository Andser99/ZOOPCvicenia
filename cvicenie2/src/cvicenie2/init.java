package cvicenie2;

import cvicenie2.student;

public class init {

	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			new student(10 + i * i % 3 + i * i / 2, "AAA" + i).pritnName();
		}
	}
	
}
