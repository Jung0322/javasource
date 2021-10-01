package Test;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("입력 ");
		Scanner scanner = new Scanner(System.in);
		String position = scanner.next();
		
		switch (position) {
		case "과장":
			System.out.println("500만원");
			break;
			
		case "부장":
			System.out.println("700만원");
			break;

		default:
			System.out.println("300만원");
			break;
		}
	}

}
