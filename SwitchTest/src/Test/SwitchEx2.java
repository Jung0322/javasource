package Test;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("�Է� ");
		Scanner scanner = new Scanner(System.in);
		String position = scanner.next();
		
		switch (position) {
		case "����":
			System.out.println("500����");
			break;
			
		case "����":
			System.out.println("700����");
			break;

		default:
			System.out.println("300����");
			break;
		}
	}

}
