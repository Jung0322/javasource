package asd;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ű :");
		
		double key = scanner.nextDouble();
		System.out.print("���� :");
		
		int age = scanner.nextInt();
		System.out.printf("Ű %.1fcm, ���� %d��\n", key,age);
		
		boolean a = (key>200)&&(age>=5);
		
		if(a) 
			System.out.println("����");
		else
			System.out.println("�Ұ���"); 
		
		boolean b = !a;
	}

}
