
public class TestSavingsAccount {

	public static void main(String[] args) {


		SavingsAccount account = new SavingsAccount();
		
		account.accountNo = 101;
		account.balance = 5000;
		account.status = "active";
		account.pin = 1234;
		
		account.printDetails();
		
		SavingsAccount account2 = new SavingsAccount(102,1000,"active",2345);
		account2.printDetails();
		
		/*account2.accountNo = 102;
		account2.balance = 1000;
		account2.status = "active";
		account2.pin = 2345;*/

	}

}
