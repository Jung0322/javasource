package Test;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) ((Math.random()*3)+1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력: ");
		int b = scanner.nextInt();
		
		switch (b) {
		
		case 1:
			if (a == 1) {
				System.out.print("비겼습니다.");
				break;
			}
			else if(a == 2) {
				System.out.print("이겼습니다.");
				break;
			}
			else {
				System.out.print("졌습니다.");
				break;
			}
			
		case 2:
			if (a == 1) {
				System.out.print("졌습니다.");
				break;
			}
			else if(a == 2) {
				System.out.print("비겼습니다.");
				break;
			}
			else {
				System.out.print("이겼습니다.");
				break;
			}
			
		case 3:
			if (a == 1) {
				System.out.print("졌습니다.");
				break;
			}
			else if(a == 2) {
				System.out.print("이겼습니다.");
				break;
			}
			else {
				System.out.print("비겼습니다.");
				break;
			}

		default:
			System.out.print("올바른 수가 아닙니다.");
			break;
		}
	}

}
