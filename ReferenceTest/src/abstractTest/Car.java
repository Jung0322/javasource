package abstractTest;

public abstract class Car {
	
	private String color;
	public void Start() {
		System.out.println("�ڵ��� ���");
	}
	public Car(String color) {
		// TODO Auto-generated constructor stub
		super();
		this.color = color;
	}
	
	abstract void drive();
	abstract void stop();
}
