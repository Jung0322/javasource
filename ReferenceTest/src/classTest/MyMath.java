package classTest;

public class MyMath {
	long a, b;

	int add() {
		return (int) (a + b);
	}

	int subtract() {
		return (int) (a - b);
	}

	int multiply() {
		return (int) (a * b);
	}

	double divide() {
		return (double) (a / b);
	}

	static int add(int a, int b) {
		return (int) (a + b);
	}

	static int subtract(int a, int b) {
		return (int) (a - b);
	}

	static int multiply(int a, int b) {
		return (int) (a * b);
	}

	static double divide(double a, double b) {
		return (double) (a / b);
	}
}
