package exception;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		try {
			account.withdraw(10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
