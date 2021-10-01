package classTest;

public class Account2 {
	private String number, name;
	private int balance;

	public Account2() {
		// TODO Auto-generated constructor stub
	}

	//[akdntmdhfmsWHr] -> [source] -> [generate constructor using field]
	public Account2(String number, String name, int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		this.number = number;
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	void add(int money) {
		balance += money;
	}

	int pop(int money) {
		if (balance > money)
			balance -= money;
		return balance;
	}

}
