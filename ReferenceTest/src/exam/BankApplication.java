package exam;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.print.event.PrintJobAttributeEvent;

public class BankApplication {

	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계죄생성 2. 계좌목록 3.예금 4. 출금 5. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

	private static void createAccount() {
		if (count <= 99) {
			System.out.print("계좌번호 입력:");
			String noString = scanner.next();
			System.out.print("계좌주 입력:");
			String owerString = scanner.next();
			System.out.print("잔액 입력:");
			int balance = scanner.nextInt();
			accountArray[count] = new Account(noString, owerString, balance);
			count++;
		} else {
			System.out.println("계좌 초과");
		}
	}

	private static void accountList() {
		for (int i = 0; i < count; i++) {
			System.out.printf("%d. 계좌주: %s 계좌번호: %s 잔액:%d\n", i + 1, accountArray[i].getOwer(),
					accountArray[i].getAno(), accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.print("계좌번호 입력: ");
		String noString = scanner.next();
		Account account = findAccount(noString);
		if (account != null) {
			System.out.print("금액 입력: ");
			int money = scanner.nextInt();
			account.setBalance(money + account.getBalance());
		}
		else {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		}
	}

	private static void withdraw() {
		System.out.print("계좌번호 입력: ");
		String noString = scanner.next();
		Account account = findAccount(noString);
		if (account != null) {
			System.out.print("금액 입력: ");
			int money = scanner.nextInt();
			if (money < account.getBalance()) {
				account.setBalance(account.getBalance() - money);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		}
		else {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		}
		
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < count; i++) {
			if ((accountArray[i].getAno()).equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}

}
