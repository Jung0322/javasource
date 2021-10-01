import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int blance = 0;
		int b;
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("1.예금 2. 출금 3. 잔고 4. 종료");
			System.out.print("선택>> ");
			int a =  scanner.nextInt();
			
			switch (a) {
			case 1:
				System.out.print("예금할 금액 입력>> ");
				b =  scanner.nextInt();
				blance+=b;
				System.out.println(blance);
				break;
			case 2:
				System.out.print("출금할 금액 입력>> ");
				b =  scanner.nextInt();
				blance-=b;
				System.out.println(blance);
				break;
			case 3:
				System.out.printf("잔액은 %d \n",blance);
				break;
			case 4:
				System.out.printf("종료");
				run = false;
				break;
				
			default:
				System.out.println("다시 입력하세요");
			}
			
		}
	}

}
