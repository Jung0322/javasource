package lambda;

public class LambdaEx1 {

	public static void main(String[] args) {
		//인터페이스를 익명구현으로 사용
		LambdaTest1 obj1 = new LambdaTest1() {
			
			@Override
			public void method1() {
				
				
			}
		};
		
		
		LambdaTest1 obj = () -> System.out.println("함수형 인터페이스");
		obj.method1();
		
		obj = () -> {
			int i = 10;
			System.out.println(i*i);
		};
		obj.method1();

	}

}
