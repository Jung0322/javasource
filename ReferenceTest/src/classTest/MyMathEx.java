package classTest;

public class MyMathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath.add(3, 5));
		System.out.println(MyMath.multiply(3, 5));
		System.out.println(MyMath.subtract(3, 5));
		System.out.println(MyMath.divide(3, 5));
		
		MyMath myMath = new MyMath();
		myMath.a = 10; 
		myMath.b = 5;
		System.out.println(myMath.add());
		System.out.println(myMath.subtract());
		System.out.println(myMath.multiply());
		System.out.println(myMath.divide());
	}

}
