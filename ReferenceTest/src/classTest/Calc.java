package classTest;

public class Calc {
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		return plus(x, y)/2;
	}
	
	void execute() {
		double result = avg(10,7);
		println(" "+result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
}
