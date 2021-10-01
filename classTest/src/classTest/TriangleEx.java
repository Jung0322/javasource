package classTest;

public class TriangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle [] = new Triangle[5];
		
		for(int i = 0 ; i < 5  ; i++) {
			triangle[i] = new Triangle(i+2, i+3);
			System.out.print((i+1)+"¹ø¤Š »ï°¢ÇüÀÇ ³ÐÀÌ´Â: ");
			triArr(triangle[i]);
		}
		
		
	}

	static void triArr(Triangle triangle) {
		System.out.println(triangle.bottom*triangle.getHeight()/2);
		
	}
}
