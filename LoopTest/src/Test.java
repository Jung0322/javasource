import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int blance = 0;
		int b;
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("1.���� 2. ��� 3. �ܰ� 4. ����");
			System.out.print("����>> ");
			int a =  scanner.nextInt();
			
			switch (a) {
			case 1:
				System.out.print("������ �ݾ� �Է�>> ");
				b =  scanner.nextInt();
				blance+=b;
				System.out.println(blance);
				break;
			case 2:
				System.out.print("����� �ݾ� �Է�>> ");
				b =  scanner.nextInt();
				blance-=b;
				System.out.println(blance);
				break;
			case 3:
				System.out.printf("�ܾ��� %d \n",blance);
				break;
			case 4:
				System.out.printf("����");
				run = false;
				break;
				
			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}
			
		}
	}

}
