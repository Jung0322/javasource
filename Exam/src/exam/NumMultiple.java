package exam;

import java.util.Scanner;

public class NumMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력");
		
		int num = scanner.nextInt();
		int bae = (num / 10) * 10 + 10;
		
		System.out.println("변수는 "+ bae + " 뺀값은 " + (bae-num));
	}

}
