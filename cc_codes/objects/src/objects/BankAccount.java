package objects;

public class BankAccount {
	
	long accoutNumber;
	String accountHolderName ;
	double balance;
	String accountType;
	String bankName;
	
	public void depositeMoney() {
		System.out.println("------>Money deposited successfully");
		
	}
	public void withdrwaMoney() {
		System.out.println("------>MOney withdrawed Successfully");
	}
	public void checkBalance() {
		System.out.println("------>Check the balance");
	}
	public void transferFunds() {
		System.out.println("--------->Transfer the Funds");
	}
}
