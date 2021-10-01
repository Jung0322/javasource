package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditLineAccount checkingAccount = new CreditLineAccount("122-12","ȫ�浿",20000,100000);
		
		System.out.println(checkingAccount.pop(1500));
		System.out.println(checkingAccount.pop(1000));
		System.out.println(checkingAccount.pop(1500));
		System.out.println(checkingAccount.pop(1000));
		System.out.println(checkingAccount.getBalance());
	}

}
