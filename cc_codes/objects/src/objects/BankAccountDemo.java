package objects;

public class BankAccountDemo {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		
		b1.accoutNumber = 461097491;
		b1.accountHolderName = " Riya Ahamed " ;
		b1.balance = 109843;
		b1.accountType = "Saving" ;
		b1.bankName = "SBI Bank Of India";
		
		System.out.println("Account Number = " +b1.accoutNumber);
		System.out.println("Bank Holder Name = " +b1.accountHolderName);
		System.out.println("Balance = " +b1.balance);
		System.out.println("Account Type = " +b1.accountType);
		System.out.println("Bank Name = " +b1.bankName);
		
		System.out.println("-------Methods Calls-------");
		b1.depositeMoney();
		b1.withdrwaMoney();
		b1.checkBalance();
		b1.transferFunds();
	}
}




/*
Account Number = 461097491
Bank Holder Name =  Riya Ahamed 
Balance = 109843.0
Account Type = Saving
Bank Name = SBI Bank Of India
-------Methods Calls-------
------>Money deposited successfully
------>MOney withdrawed Successfully
------>Check the balance
--------->Transfer the Funds


*/

