import java.util.Scanner;

public class BMI_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸�");
		String nameString = scanner.next();
		
		System.out.print("Ű");
		Double key = scanner.nextDouble();
		
		System.out.print("������");
		Double weight = scanner.nextDouble();
		
		Double bmi =  weight / (key*key*0.0001);
		
		if( bmi >= 35)
			System.out.println(nameString + "�� �� ��");
		else if( bmi >= 30)
			System.out.println(nameString + "�� �ߵ� ��");
		else if( bmi >= 25)
			System.out.println(nameString + "�� �浵 ��");
		else if( bmi >= 23)
			System.out.println(nameString + "�� ��ü��");
		else if( bmi >= 18.5)
			System.out.println(nameString + "�� ����");
		else 
			System.out.println(nameString + "�� ��ü��");
		
	}

}
