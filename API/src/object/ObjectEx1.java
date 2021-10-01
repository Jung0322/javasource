package object;

public class ObjectEx1 {

	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();
		
		System.out.println(object1.equals(object2));
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2));
	}

}
