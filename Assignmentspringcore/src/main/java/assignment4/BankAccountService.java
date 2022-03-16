package assignment4;

public interface BankAccountService {

	public double withdraw(long accountId, double balanceToWithdraw);
	public double deposit(long accountId, double amounttodepo);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont);
}
