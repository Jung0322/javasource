import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Scanner scanner = new Scanner(System.in);
		System.out.print("ют╥б: ");
		int a = scanner.nextInt();
		*/
		
		/*
		for( int i = 1 ; i < 10; i++) {
			for (int j = 1 ; j <= a ; j++) {
				System.out.print(j + " * " + i + " = " + (i*j) + "\t");
			}
			System.out.println();
		}
		*/
		/*
		for( int i = 1 ; i <= a; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.print(i + " * " + j + " = " + (i*j) + "\t");
			}
			System.out.println();
		}
		*/
		for ( int i = 1 ; i < 10 ; i++ ) {
			for (int j = 0 ; j < i ; j ++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
