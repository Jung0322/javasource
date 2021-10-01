package com.samsung.project;

import com.hyndai.project.Account;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("122-01-12222", "Á¤¿íÁø", 5000);
		int total = account.balance;
		total = account.pop(500);
		System.out.println(total +" "+account.balance);
		account.add(600);
		System.out.println(account.balance);
	}

}
