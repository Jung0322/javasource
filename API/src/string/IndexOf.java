package string;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "�ڹ� ���α׷���";
		
		// �Ű������� �־��� ���ڿ��� ���۵Ǵ� ��ġ�� ����
		System.out.println(str1.indexOf("���α׷���"));
		
		// ��ã�� ��� -1
		System.out.println("��ã�� ���: "+ str1.indexOf("���̽�"));
		
		System.out.println();
		
		String str2 = "HelloHelloHello World";
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el",2));
		
		System.out.println("l ã��: "+ str2.lastIndexOf("l"));
		
		System.out.println(str2.indexOf('��')==-1?"���ԵǾ����� ����":"���ԵǾ�����");
	}

}
