package lambda;

import java.util.Arrays;

public class FromArrayEx1 {

	public static void main(String[] args) {
		//��Ʈ�� : �ڹ� 8 ���� �߰�
		// �÷����� ��Ҹ� �ϳ��� �����ؼ� ���ٽ����� ó���� �� �ֵ��� �����ִ� �ݺ���
		// ���͸�, ���ΰ� ���� �߰� ó���� ������
		// �ڵ尡 ���Ἲ ����, ����� ���� ó���� �÷��� ���ο��� �˾Ƽ� ó��
		// ��Ʈ���� ������ �ҽ��� �������� ����(�б⸸ ��), ��ȸ��
		
		// ��Ʈ�� ���� 1) �߰����� : ���� ����� ��Ʈ���� ����, �����ؼ� �� �ٸ� ���� ����
		//			2) �������� : ���� ����� ��Ʈ���� �ƴ� ����, ��Ʈ���� ��Ҹ� �Ҹ��߱� ������ �� ���� ����
		//	stream.distinct().limit(5).sorted().forEach(System.out::println)
		String[] strArray = {"���","�ٳ���","����","����","�޷�"};
		
		//�迭 -> stream
		//�迭�� �����ϰ� ����� �� �ֵ��� �����Ǵ� Ŭ���� Arrays
		
		Arrays.stream(strArray).forEach(str -> System.out.println(str));
		
	}

}