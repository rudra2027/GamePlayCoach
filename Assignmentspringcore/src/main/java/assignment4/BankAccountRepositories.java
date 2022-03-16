package assignment4;

public interface BankAccountRepositories {
    public double getBalance(long accountId);
    public double updateBalance(long accountId, double newBalance);
}