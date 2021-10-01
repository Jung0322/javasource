import java.util.Scanner;

public class BMI_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름");
		String nameString = scanner.next();
		
		System.out.print("키");
		Double key = scanner.nextDouble();
		
		System.out.print("몸무게");
		Double weight = scanner.nextDouble();
		
		Double bmi =  weight / (key*key*0.0001);
		
		if( bmi >= 35)
			System.out.println(nameString + "은 고도 비만");
		else if( bmi >= 30)
			System.out.println(nameString + "은 중도 비만");
		else if( bmi >= 25)
			System.out.println(nameString + "은 경도 비만");
		else if( bmi >= 23)
			System.out.println(nameString + "은 과체중");
		else if( bmi >= 18.5)
			System.out.println(nameString + "은 정상");
		else 
			System.out.println(nameString + "은 저체중");
		
	}

}
