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
			System.out.println("1.���˻��� 2. ���¸�� 3.���� 4. ��� 5. ����");
			System.out.println("-----------------------------------");
			System.out.print("����>");

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
		System.out.println("���α׷� ����");

	}

	private static void createAccount() {
		if (count <= 99) {
			System.out.print("���¹�ȣ �Է�:");
			String noString = scanner.next();
			System.out.print("������ �Է�:");
			String owerString = scanner.next();
			System.out.print("�ܾ� �Է�:");
			int balance = scanner.nextInt();
			accountArray[count] = new Account(noString, owerString, balance);
			count++;
		} else {
			System.out.println("���� �ʰ�");
		}
	}

	private static void accountList() {
		for (int i = 0; i < count; i++) {
			System.out.printf("%d. ������: %s ���¹�ȣ: %s �ܾ�:%d\n", i + 1, accountArray[i].getOwer(),
					accountArray[i].getAno(), accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.print("���¹�ȣ �Է�: ");
		String noString = scanner.next();
		Account account = findAccount(noString);
		if (account != null) {
			System.out.print("�ݾ� �Է�: ");
			int money = scanner.nextInt();
			account.setBalance(money + account.getBalance());
		}
		else {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
		}
	}

	private static void withdraw() {
		System.out.print("���¹�ȣ �Է�: ");
		String noString = scanner.next();
		Account account = findAccount(noString);
		if (account != null) {
			System.out.print("�ݾ� �Է�: ");
			int money = scanner.nextInt();
			if (money < account.getBalance()) {
				account.setBalance(account.getBalance() - money);
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		}
		else {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
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
