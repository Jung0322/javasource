package lambda;

import java.util.stream.IntStream;

public class FromIntRangeEx1 {
	
	static int sum = 0;

	public static void main(String[] args) {
		// 1~100 гу╟Х
//		int sum = 0;
//		for(int i =1;i<=100;i++) sum+=i;
		
		IntStream.rangeClosed(1, 100).forEach(i -> sum+=i);
		System.out.println(sum);
		
	}

}
