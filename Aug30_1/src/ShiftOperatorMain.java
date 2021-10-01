import java.util.Scanner;

public class ShiftOperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("중간고사: ");
		float mil = scanner.nextFloat();
		
		System.out.print("기말고사: ");
		float finals = scanner.nextFloat();
		
		float avg = (mil + finals) / 2;
		
		if(avg >= 90)
			System.out.println("수");
		else {
			System.out.println("야!");
		}
		
		
	}

}
