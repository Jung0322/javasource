package inheritance;

public class BonusPointAccount extends Account2{
	
	private int Bonous;
	
	public BonusPointAccount(String number, String name, int balance, int Bonus) {
		super(number, name, balance);
		this.Bonous = Bonus;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	void add(int money) {
		setBalance((int) (getBalance()+getBalance()*Bonous*0.01));
	}
	
}
