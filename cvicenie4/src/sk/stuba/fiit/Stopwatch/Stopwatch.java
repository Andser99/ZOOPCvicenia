package sk.stuba.fiit.Stopwatch;

public class Stopwatch {
	private long start;

	Stopwatch() {
		start = System.currentTimeMillis();
	}

	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}
	
	public void resetStopwatch() {
		start = System.currentTimeMillis();
	}
}
