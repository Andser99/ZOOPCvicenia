package sk.stuba.fiit.konverzia;

public class Fibonacci {
	
	String s = new String("Ahoj");
	
	
	public long fib(int n) {
		if (n <= 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public int factorial(int N) {
		if (N == 1)
			return 1;
		return N * factorial(N - 1);
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
		Fibonacci fb = new Fibonacci();
		
		while (N > 0) {
			System.out.println(fb.fib(N));
			N--;
		}
		
		fb.factorial(Integer.parseInt(args[0]));
		System.out.println(fb.s);
		System.out.println(fb.s.charAt(0));
		for (int i = 1; i <= N; i++)
		 System.out.println(i + ": " + fb.fib(i));
	}
}
