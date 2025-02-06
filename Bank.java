package BankManagement;

public class Bank {
	private int id=101;
	private String name="Renuka";
	private double balance=2100;
	private int pin=2114;
	public Bank() {
		super();
	}
	public Bank(int id, String name, double balance, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

}
