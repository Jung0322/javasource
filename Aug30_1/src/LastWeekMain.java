import java.awt.peer.LightweightPeer;
import java.util.Scanner;

public class LastWeekMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		//3항연산 조건식 ? O일때값 : X때 값
		String say = (age >= 20) ? "안녕하세요" : "나가";
		System.out.println(say);
		
		String oeString = ((age%2)== 0) ? "짝수" : "홀수";
		System.out.println(oeString);
		
		System.out.println("이름");
		String name = scanner.next();
		
		// 연산자라는 것은 스택이 대상이지만 String에 저장된 값은 힙 영역에 존재
		String say2 = name.equals("홍길동") ? "어" : "야!!!";
		System.out.print(say2);
		
	}

}
