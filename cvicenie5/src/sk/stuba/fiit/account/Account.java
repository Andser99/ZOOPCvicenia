package sk.stuba.fiit.account;

public class Account {
	private String IDaccount;
	private String ownerName;
	private double amount;
	
	
	public Account(String ownerName, double amount) {
		super();
		this.ownerName = ownerName;
		this.amount = amount;
		System.out.println("Bol vytvoren� ��et na meno: " + this.ownerName + " s vkladom vo vy�ke: " + this.amount);
	}
	
	void addFunds(double amount) {
		this.amount += amount;
	}
	
	void transfer(Account a, double amount) {
		this.amount -= amount;
		a.addFunds(amount);
	}
	
	public String toString() {
		return "Stav: " + this.amount;
	}
	
}
