package abstractTest;

public class AICar extends Car {

	public AICar(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void drive() {
		System.out.println("�ڵ�����");

	}

	@Override
	void stop() {
		System.out.println("�ڵ����� ����");

	}

}
