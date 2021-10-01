package asd;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로:");
		int a =  scanner.nextInt();
		System.out.print("세로:");
		int b =  scanner.nextInt();
		System.out.print("높이:");
		int c =  scanner.nextInt();
		System.out.print("무게:");
		int d =  scanner.nextInt();
		
		System.out.println("부피: "+(a*b*c));
		
	}

}
