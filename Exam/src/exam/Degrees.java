package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("È­¾¾¿Âµµ ÀÔ·Â: ");
		double ha = scanner.nextDouble();
		
		double sub = ( ha - 32 ) * 5 / 9;
		System.out.print("¼·¾¾¿Âµµ´Â " + sub);
	}

}
