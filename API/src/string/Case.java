package string;

public class Case {

	public static void main(String[] args) {
		// ��ҹ��� ����
		String str1 = "Java programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		//��ҹ��� �������� ���� ��
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
	}

}
