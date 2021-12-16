package lambda;

//function interface
//메소드가 하나만 선언해야 함

@FunctionalInterface
public interface MyNumber {
	int max(int num1, int num2);
}
