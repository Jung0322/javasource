package Test;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�Է� ");
		int a =  scanner.nextInt();
		
		System.out.print("�Է� ");
		int b =  scanner.nextInt();
		
		System.out.print("������ �Է� ");
		String c =  scanner.next();
		
		switch (c) {
		case"+":
			System.out.println("����: " + (a+b));
			break;
		case"-":
			System.out.println("����: " + (a-b));
			break;
		case"*":
			System.out.println("����: " + (a*b));
			break;
		case"/":
			System.out.println("����: " + (a/b));
			break;

		default:
			System.out.println("�ش� �����ڰ� ����");
			break;
		}
		
	}

}
