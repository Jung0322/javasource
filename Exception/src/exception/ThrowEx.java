package exception;

public class ThrowEx {
// main���� throws �� �ǹ�: jvm ���� �������� �ǹ� => ȭ�� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// throws :  ���⼭ �߻��� ���ܸ� �� �޼ҵ带 ȣ���ϴ� ������ ��������
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}

}
