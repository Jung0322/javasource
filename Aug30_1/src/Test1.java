import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		System.out.print("이름: ");
		String nameString = scanner.next();
		
		System.out.print("키: ");
		Double key = scanner.nextDouble();
		
		System.out.print("몸무게: ");
		Double weight = scanner.nextDouble();
		
		Double standard = (key-100) * 0.9;
		String result = ((weight/standard) * 100) > 120 ? "비만" : "정상";
		
		System.out.print(nameString + "은"+result);	
	}

}
