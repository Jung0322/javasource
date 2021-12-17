package lambda;

import java.util.Arrays;

public class FromArrayEx2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
		
		System.out.println("배열 합계: "+sum+" 배열 개수: "+count); 
	}

}
