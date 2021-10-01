package asd;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("키 :");
		
		double key = scanner.nextDouble();
		System.out.print("나이 :");
		
		int age = scanner.nextInt();
		System.out.printf("키 %.1fcm, 나이 %d살\n", key,age);
		
		boolean a = (key>200)&&(age>=5);
		
		if(a) 
			System.out.println("가능");
		else
			System.out.println("불가능"); 
		
		boolean b = !a;
	}

}
