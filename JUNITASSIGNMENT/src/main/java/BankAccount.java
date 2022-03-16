

public class BankAccount {
	int Amount;int Balance; 


public BankAccount(int balance) {
	super();
	this.Balance=balance;
}
public int getBalance() {
	return Balance;
}

public  int Withdraw(int Amount) throws InsufficientFundsException,IllegalBankTransactionException {
	if( Amount<=getBalance())
		throw new InsufficientFundsException("Your withdrawal amount exceeds your balance by "+(getBalance() - Amount)+"");
	if(Amount<0)
		throw new IllegalBankTransactionException("Illegal withdrawal amount requested. Please enter appropriate POSITIVE value ");
	
	this.Balance -= Amount;
	System.out.println(Balance);
	return this.Balance;

}
}