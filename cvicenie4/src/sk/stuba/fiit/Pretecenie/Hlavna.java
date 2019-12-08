package sk.stuba.fiit.Pretecenie;

public class Hlavna {

	public static void main(String[] args) {

		System.out.println(Short.SIZE);
		System.out.println(Byte.SIZE);

		short s = 250;

		for (int i = 0; i < 10; i++) {
			s++;
			System.out.println("short s=" + s + " | byte s=" + (byte) s);
		}
		
		byte b = 122;
		
		for (int i = 0; i < 10; i++) {
			b++;
			System.out.println("byte b=" + b );
		}

	}

}
