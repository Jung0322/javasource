package string;

public class Replace {

	public static void main(String[] args) {
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�, �ڹٴ� ǳ���� API�� �����մϴ�.";
		
		str1 = str1.replace("�ڹ�","Java");
		System.out.println(str1);
		
		str1 =  str1.replaceFirst("Java", "�ڹ�" );
		System.out.println(str1);
	}

}
