import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		
		int point = price / 100;
		
		if( price > 20000 && price < 50000)
			point += 100;
		
		System.out.print(point);

	}

}
