package lambda;

public class LamdaEx5 {
	
	//�Ű������� �����ϴ� ���ٽ�
	public static void execute(LambdaTest5 lamda) {
		lamda.run();
	}
	
	// ��ȯ ������ ���̴� ���ٽ�
	public static LambdaTest5 getRun() {
		LambdaTest5 obj1 = () -> System.out.println("�Լ��� �������̽� ����");
		return obj1;
	}

	public static void main(String[] args) {
		//���ٽ�
		LambdaTest5 lamda = () -> System.out.println("Lamda!!! run");
		lamda.run();
		
		//�Ű������� �����ϴ� ���ٽ�
		System.out.println("--------------------");
		execute(getRun());
		System.out.println("--------------------");
	}

}
