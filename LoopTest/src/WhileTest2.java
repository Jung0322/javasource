import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random()*100+1);
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�Է�: ");
			int a =  scanner.nextInt();
			if(a == num){
				System.out.printf("��ǻ�� %d ��� %d \n����",num, a);
				break;
			}
			if(a > num){
				System.out.printf("������� ���ڰ� �� Ů�ϴ�.\n");
			}else {
				System.out.printf("��ǻ���� ���ڰ� �� Ů�ϴ�.\n");
			}
		}
	}

}
