package poly;

public class PolyArgumentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
		
		buyer.buy(new Tv(100));
		buyer.buy(new Computer(100));
		buyer.buy(new Audio(100));
		
		System.out.println("���� ���� ���� " + buyer.money);
		System.out.println("���� ���� ���ʽ��� " + buyer.bonusPoint);
	}

}
