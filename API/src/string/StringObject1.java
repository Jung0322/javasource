package string;

public class StringObject1 {

	public static void main(String[] args) {
		// 축약방법
		String str1 = "안녕하세요";
		
		//정식방법
		String str2 = new String("안녕하새요");
		
		char [] value = {'a','b','c','d','e'};
		String string = new String(value);
		
		System.out.println(string);
	}

}
