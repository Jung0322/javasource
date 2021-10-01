package string;

public class Case {

	public static void main(String[] args) {
		// 대소문자 변경
		String str1 = "Java programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		//대소문자 구별하지 말고 비교
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
	}

}
