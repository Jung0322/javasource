package inheritance;


public class Cellphone {
	String model, color;
	
	void poewOn() {
		System.out.println("전원 on");
	}
	void poewrOff() {
		System.out.println("전원 off");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendVoice(String msg) {
		System.out.println("본인: "+ msg);
	}
	void receiveVoice(String msg) {
		System.out.println("상대방: "+ msg);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
