package sk.stuba.fiit.Stopwatch;

public class Main {
	public static void main(String[] args) {
		Stopwatch s = new Stopwatch();
		int i;

		for (i = 1; i < 100000; i++)
			System.out.println("stopky");

		System.out.println(s.elapsedTime());

		s.resetStopwatch();

		System.out.println(s.elapsedTime());
	}
}
