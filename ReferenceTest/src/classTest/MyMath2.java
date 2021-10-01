package classTest;

public class MyMath2 {
	int add(int a, int b) {
		return a + b;
	}
	
	long add(long a, long b) {
		return a + b;
	}
	
	int add(int arr[]) {
		int result = 0; 
		for(int i=0;i<arr.length;i++)
			result +=i;
		return result;
	}
}
