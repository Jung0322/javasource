package Math;

public class MathEx2 {

	public static void main(String[] args) {
		int a [] = new int [3];
		for(int i = 0 ; i< 3 ; i++) {
			a[i] = (int)(Math.random()*3+1);
			System.out.println(a[i]);
		}
	}

}
