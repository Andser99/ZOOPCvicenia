package sk.stuba.fiit.hudba;

//Objekty triedy Wind sú Inštrumenty
//pretože majú to isté rozhranie:
public class Wind extends Instrument {
	
	
	void tune(Instrument i) {
		i.play();
	}
	
	public static void main(String[] args) {

		Wind flute = new Wind();
		new Instrument().tune(flute); // Upcasting
		//flute.
	}
}
