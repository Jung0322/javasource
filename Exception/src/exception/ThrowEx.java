package exception;

public class ThrowEx {
// main에서 throws 의 의미: jvm 한테 던져지는 의미 => 화면 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// throws :  여기서 발생한 예외를 이 메소드를 호출하는 곳으로 던지겠음
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}

}
