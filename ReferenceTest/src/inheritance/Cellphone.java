package inheritance;


public class Cellphone {
	String model, color;
	
	void poewOn() {
		System.out.println("���� on");
	}
	void poewrOff() {
		System.out.println("���� off");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	void sendVoice(String msg) {
		System.out.println("����: "+ msg);
	}
	void receiveVoice(String msg) {
		System.out.println("����: "+ msg);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
