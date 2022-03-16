package assignment4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service("service")
public class BankAccountServiceImpl implements BankAccountService,ApplicationContextAware{
	private  ApplicationContext context;
	public double withdraw(long accountId, double balanceToWithdraw) {
		// TODO Auto-generated method stub

		double newBalance=0;
        BankAccountReposetoriesImpl acc=(BankAccountReposetoriesImpl) context.getBean("Bankrepo");
        if(acc.getBalance(accountId)>=balanceToWithdraw)
            newBalance = acc.getBalance(accountId)-balanceToWithdraw;
        acc.updateBalance(accountId,newBalance);
        return  newBalance;
	}

	public double deposit(long accountId, double amounttodepo) {
		// TODO Auto-generated method stub
		BankAccountReposetoriesImpl acc=(BankAccountReposetoriesImpl) context.getBean("Bankrepo");
        double Newbalance = acc.getBalance(accountId)+amounttodepo;
        return acc.updateBalance(accountId,Newbalance);
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		BankAccountReposetoriesImpl balance=(BankAccountReposetoriesImpl) context.getBean("Bankrepo");
		return balance.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		// TODO Auto-generated method stub
		BankAccountReposetoriesImpl accountrepository=(BankAccountReposetoriesImpl) context.getBean("Bankrepo");
		if(accountrepository.getBalance(fromAccount)>=amont){
            double updatedAmt= amont+accountrepository.getBalance(toAccount);

            // updating both the accounts
            accountrepository.updateBalance(fromAccount,accountrepository.getBalance(fromAccount)-amont);
            accountrepository.updateBalance(toAccount,updatedAmt);
            return true;
        }
        return false;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	} 

}
