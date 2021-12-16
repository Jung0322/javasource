package lambda;

public class LamdaEx5 {
	
	//매개변수로 전달하는 람다식
	public static void execute(LambdaTest5 lamda) {
		lamda.run();
	}
	
	// 반환 값으로 쓰이는 람다식
	public static LambdaTest5 getRun() {
		LambdaTest5 obj1 = () -> System.out.println("함수형 인터페이스 리턴");
		return obj1;
	}

	public static void main(String[] args) {
		//람다식
		LambdaTest5 lamda = () -> System.out.println("Lamda!!! run");
		lamda.run();
		
		//매개변수로 전달하는 람다식
		System.out.println("--------------------");
		execute(getRun());
		System.out.println("--------------------");
	}

}
