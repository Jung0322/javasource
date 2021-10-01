package inheritance;

public class CreditLineAccount extends Account2{
	
	private int limit;

	public CreditLineAccount(String number, String name, int balance, int limit) {
		super(number, name, balance);
		this.limit = limit;
		// TODO Auto-generated constructor stub
	}

	@Override
	int pop(int money) {
		// TODO Auto-generated method stub
		if(limit+getBalance()<money) {
			System.out.println("인출 불가");
			return 0;
		}else {
			return super.pop(money);
		}
	
	}
	
}
