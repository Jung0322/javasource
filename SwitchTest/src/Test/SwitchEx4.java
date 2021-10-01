package Test;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 ");
		int a =  scanner.nextInt();
		
		System.out.print("입력 ");
		int b =  scanner.nextInt();
		
		System.out.print("연산자 입력 ");
		String c =  scanner.next();
		
		switch (c) {
		case"+":
			System.out.println("값은: " + (a+b));
			break;
		case"-":
			System.out.println("값은: " + (a-b));
			break;
		case"*":
			System.out.println("값은: " + (a*b));
			break;
		case"/":
			System.out.println("값은: " + (a/b));
			break;

		default:
			System.out.println("해당 연산자가 없음");
			break;
		}
		
	}

}
