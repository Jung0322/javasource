package Test;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) ((Math.random()*3)+1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է�: ");
		int b = scanner.nextInt();
		
		switch (b) {
		
		case 1:
			if (a == 1) {
				System.out.print("�����ϴ�.");
				break;
			}
			else if(a == 2) {
				System.out.print("�̰���ϴ�.");
				break;
			}
			else {
				System.out.print("�����ϴ�.");
				break;
			}
			
		case 2:
			if (a == 1) {
				System.out.print("�����ϴ�.");
				break;
			}
			else if(a == 2) {
				System.out.print("�����ϴ�.");
				break;
			}
			else {
				System.out.print("�̰���ϴ�.");
				break;
			}
			
		case 3:
			if (a == 1) {
				System.out.print("�����ϴ�.");
				break;
			}
			else if(a == 2) {
				System.out.print("�̰���ϴ�.");
				break;
			}
			else {
				System.out.print("�����ϴ�.");
				break;
			}

		default:
			System.out.print("�ùٸ� ���� �ƴմϴ�.");
			break;
		}
	}

}
