package string;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "자바 프로그래밍";
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
			if("그".equals(str1.charAt(i))) {
				a++;
			}
		}
		System.out.println(a==1?"포함되어있음":"포함되어있지않음");

	}

}
