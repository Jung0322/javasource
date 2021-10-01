package InterfaceTest;
/* 1) 상수필드만 가짐
 * 2) 추상 메소드만 가짐
 * 
 */
public interface AdderInterface {
	public static final int x = 100;
	
	void method1();
	/*
	 * 1.8부터 static 메소드와 default 메서드 들어올 수 있음
	 */
	static void method2() {
		
	}
	default void method3() {
		
	}
}
