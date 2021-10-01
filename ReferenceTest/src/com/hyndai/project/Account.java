package com.hyndai.project;


public class Account {

	public String number, name;
	public int balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String number, String name, int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		this.number = number;
		this.name = name;
	}

	public void add(int money) {
		balance += money;
	}

	public int pop(int money) {
		if (balance > money)
			balance -= money;
		return balance;
	}

}
