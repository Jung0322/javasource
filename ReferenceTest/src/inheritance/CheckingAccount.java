package inheritance;

public class CheckingAccount extends Account2 {
	public CheckingAccount(String number, String name, int balance, String cardNo) {
		super(number, name, balance);
		this.cardNo = cardNo;
		// TODO Auto-generated constructor stub
	}

	private String cardNo;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	int pay(String no, int money) {
		if (!no.equals(cardNo) || super.getBalance() < money) {
			System.out.println("ī���ȣ�� ���ݾ��� Ȯ�����ּ���.");
			return 0;
		}
		return pop(money);
	}
}
