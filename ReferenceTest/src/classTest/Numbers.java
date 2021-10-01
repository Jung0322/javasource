package classTest;

public class Numbers {
	private int num[];

	public Numbers(int[] num) {
		super();
		this.num = num;
	}
	
	int sum() {
		int a = 0;
		for(int i = 0; i < num.length; i++) {
			a+=num[i];
		}
		return a;
	}
	
	double avg() { 
		return (double) sum() / num.length;
	}
}
