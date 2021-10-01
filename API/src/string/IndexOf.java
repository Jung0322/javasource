package string;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "자바 프로그래밍";
		
		// 매개값으로 주어진 문자열이 시작되는 위치를 리턴
		System.out.println(str1.indexOf("프로그래밍"));
		
		// 못찾는 경우 -1
		System.out.println("못찾는 경우: "+ str1.indexOf("파이썬"));
		
		System.out.println();
		
		String str2 = "HelloHelloHello World";
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el",2));
		
		System.out.println("l 찾기: "+ str2.lastIndexOf("l"));
		
		System.out.println(str2.indexOf('그')==-1?"포함되어있지 않음":"포함되어있음");
	}

}
