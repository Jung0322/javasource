package asd;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		for (int i = 0; i < 1; i++) {
			try {
				System.out.print("X:");
				x = scanner.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("�ٽ��Է��Ͻÿ�");
				scanner.nextLine();
				i--;
			}
		}
		int y = 0;
		for (int i = 0; i < 1; i++) {
			try {
				System.out.print("Y:");
				y = scanner.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("�ٽ��Է��Ͻÿ�");
				scanner.nextLine();
				i--;
			}
		}
		System.out.println(x + "   " + y);
	}

}
