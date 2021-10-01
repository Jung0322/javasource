package classTest;

public class Account {

	String number, name;
	int balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String number, String name, int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		this.number = number;
		this.name = name;
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
