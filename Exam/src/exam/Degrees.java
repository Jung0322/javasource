package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("ȭ���µ� �Է�: ");
		double ha = scanner.nextDouble();
		
		double sub = ( ha - 32 ) * 5 / 9;
		System.out.print("�����µ��� " + sub);
	}

}
