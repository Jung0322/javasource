import java.util.Scanner;

public class ShiftOperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�߰����: ");
		float mil = scanner.nextFloat();
		
		System.out.print("�⸻���: ");
		float finals = scanner.nextFloat();
		
		float avg = (mil + finals) / 2;
		
		if(avg >= 90)
			System.out.println("��");
		else {
			System.out.println("��!");
		}
		
		
	}

}
