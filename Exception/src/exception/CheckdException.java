package exception;

public class CheckdException {
	
	//checkedException : compile 시 나타나는 예외
	//UnCheckedException :

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("java.lang.String");
	}

}
