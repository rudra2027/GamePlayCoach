package assignment4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class BankAccountController implements ApplicationContextAware {

	private ApplicationContext context;
	
	public double withdraw(long accountId, double balanceToWithdraw){
        double newBalance=0;
        BankAccountService acc=(BankAccountService) context.getBean("service");
        newBalance = acc.withdraw(accountId,balanceToWithdraw);
        return newBalance;
    }
	public double deposit(long accountId, double amounttodepo){
        BankAccountService acc=(BankAccountService) context.getBean("service");
        double newBalance = acc.deposit(accountId,amounttodepo);
        return newBalance;
    }
	public double getBalance(long accountId) {
		 BankAccountService acc=(BankAccountService) context.getBean("service");
		 return acc.getBalance(accountId);
	}
	
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		BankAccountService acc=(BankAccountService) context.getBean("service");
		return acc.fundTransfer(fromAccount,toAccount,amont);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=applicationContext;
		
	}

}
