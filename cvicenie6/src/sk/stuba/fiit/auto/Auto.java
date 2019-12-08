package sk.stuba.fiit.auto;

public class Auto {
	private Motor motor;
	
	Auto() { // motor sity na mieru
		this.motor = new Motor();
	}
	
	Auto(Motor m)  { //
		this.motor = m;
	}
	
	public Motor getMotro() {
		return this.motor;
	}
}
