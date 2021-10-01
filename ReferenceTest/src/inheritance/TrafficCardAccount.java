package inheritance;

public class TrafficCardAccount extends CheckingAccount{
	
	private Boolean hasTrafficCard;
	
	public TrafficCardAccount(String number, String name, int balance, String cardNo, Boolean hasTrafficCard) {
		super(number, name, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}

	int payTrafficCard(String cardNo, int money) {
		if (hasTrafficCard) {
			return pay(cardNo,money);
		}else{
			System.out.println("����ī���� �Ǵ� �ش� ī���ȣ�� �����ϴ�.");
			return 0;
		}
	}
}
