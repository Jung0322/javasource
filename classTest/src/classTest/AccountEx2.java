package classTest;

public class AccountEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 account = new Account2("122-01-12222", "������", 5000);
		int total = account.getBalance();
		total = account.pop(500);
		System.out.println(total +" "+account.getBalance());
		account.add(600);
		System.out.println(account.getBalance());
	}

}
