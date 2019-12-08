

package cvicenie2;

public class student {

	int age;
	String name;
	
	public student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void pritnName() {
		System.out.println("Name: " + this.name + " Age: " + this.age);
	}
	
	public void getOlder() {
		this.age++;
	}
}
