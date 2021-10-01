import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random()*100+1);
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("입력: ");
			int a =  scanner.nextInt();
			if(a == num){
				System.out.printf("컴퓨터 %d 사랑 %d \n종료",num, a);
				break;
			}
			if(a > num){
				System.out.printf("사용자의 숫자가 더 큽니다.\n");
			}else {
				System.out.printf("컴퓨터의 숫자가 더 큽니다.\n");
			}
		}
	}

}
