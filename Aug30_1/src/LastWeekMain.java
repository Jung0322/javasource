import java.awt.peer.LightweightPeer;
import java.util.Scanner;

public class LastWeekMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		//3�׿��� ���ǽ� ? O�϶��� : X�� ��
		String say = (age >= 20) ? "�ȳ��ϼ���" : "����";
		System.out.println(say);
		
		String oeString = ((age%2)== 0) ? "¦��" : "Ȧ��";
		System.out.println(oeString);
		
		System.out.println("�̸�");
		String name = scanner.next();
		
		// �����ڶ�� ���� ������ ��������� String�� ����� ���� �� ������ ����
		String say2 = name.equals("ȫ�浿") ? "��" : "��!!!";
		System.out.print(say2);
		
	}

}
