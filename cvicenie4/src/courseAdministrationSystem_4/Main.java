package courseAdministrationSystem_4;

//import sk.stuba.fiit.privateCon.A;

public class Main {
	public static void main(String[] args) {

		// System.out.println(sk.stuba.fiit.privateCon.A.getInstace());
		// System.out.println(A.getInstace());
		// System.out.println(A.getInstace());
		// System.out.println(A.getInstace());
		new Student().zakric();
		new Student().zakric("ahoj");
		new Student().zakric("ahoj", 3.1);
		//new Student().zakric(3.1, "ahoj");
	}
}
