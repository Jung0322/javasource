package poly;

public class Manger extends Employee {
	@Override
	public void work() {
		System.out.println(super.getPosition() + " ����" + super.getName() + "�� ���� �մϴ�.");
	}
}
