import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("메시지입력(q입력 시 종료): ");
		String inputString;

		do {
			System.out.print("> ");
			inputString = scanner.next();
			System.out.println(inputString);

		} while (!inputString.equals("q"));
		System.out.println("종료");
	}
}
