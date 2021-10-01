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
			System.out.println("교통카드기능 또는 해당 카드번호가 없습니다.");
			return 0;
		}
	}
}
