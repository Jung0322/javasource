import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		System.out.print("�̸�: ");
		String nameString = scanner.next();
		
		System.out.print("Ű: ");
		Double key = scanner.nextDouble();
		
		System.out.print("������: ");
		Double weight = scanner.nextDouble();
		
		Double standard = (key-100) * 0.9;
		String result = ((weight/standard) * 100) > 120 ? "��" : "����";
		
		System.out.print(nameString + "��"+result);	
	}

}
