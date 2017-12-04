
public class SavingsAccount {

	//fields or instance variables or non static variables
	int accountNo;
	float balance;
	String status;
	int pin;
	
	//default constructor
	public SavingsAccount() {
		
	}
	
	//Parameterized constructor
	public SavingsAccount(int accountNo, float balance, String status, int pin) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.status = status;
		this.pin = pin;
	}
	
	void withdraw(int withdrawalAmount)
	{
		//business logic
		if(status == "active")
		{
			if(withdrawalAmount<balance)
			{
				balance = balance - withdrawalAmount;
			}
			else
			{
				System.out.println("You have insufficient funds");
			}
		}
		else
		{
			System.out.println("Account is inactive");
		}
	}
	
	

	
	void printDetails()
	{
		System.out.println("Account Number :" + accountNo);
		System.out.println("Balance : "+balance);
		System.out.println("Status : " + status);
	}
}
