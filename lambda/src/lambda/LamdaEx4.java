package lambda;

public class LamdaEx4 {

	public static void main(String[] args) {
		LambdaTest4 obj = a -> {
			System.out.println(a+"!!");
		};
		obj.showString("Hello");
		
		showMyString(obj);
	}
	
	public static void showMyString(LambdaTest4 lamda) {
		lamda.showString("hello lambda");
	}
}
