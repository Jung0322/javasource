package lambda;

public class LamdaEx3 {

	public static void main(String[] args) {
		String str1= "hello";
		String str2= "world";
		LambdaTest3 obj = (s,v) -> {
			System.out.println(s+" ,"+v);
		};
		obj.makeString(str1, str2);
	}

}
