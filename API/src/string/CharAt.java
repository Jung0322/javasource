package string;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "�ڹ� ���α׷���";
		char ch = str1.charAt(3);
		System.out.println(ch);
		
		System.out.println();
		
		String str2 = "Hello java!!";
		char ch2 [] = new char[str2.length()];
		for(int i = 0; i < str2.length(); i++) {
			ch2[i] = str2.charAt(i);
		}
		System.out.println(ch2);
		
		int a= 0 ;
		for (int i = 0 ; i< str1.length();i++) {
			if("��".equals(str1.charAt(i))) {
				a++;
			}
		}
		System.out.println(a==1?"���ԵǾ�����":"���ԵǾ���������");

	}

}
