package assignment4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("Bankrepo")
public class BankAccountReposetoriesImpl implements BankAccountRepositories{

	 @Autowired
	    private BankAccount BA1;

	 @Autowired
	    private BankAccount BA2;
	    
public  void  BankAccountepositoryImpl(){};

	public BankAccountReposetoriesImpl(BankAccount bA1, BankAccount bA2) {
	super();
	BA1 = bA1;
	BA2 = bA2;
}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		if(this.BA1.getAccountId()==accountId){
	           return BA1.getAccountBalance();
	        }
	        else{
	           return  BA2.getAccountBalance();
	        }
	}

	public double updateBalance(long accountId, double newBalance) {
		
		// TODO Auto-generated method stub
		double updatedBal=0;
        if(this.BA1.getAccountId()==accountId){
            updatedBal = newBalance;
            BA1.setAccountBalance(updatedBal);
        }
        else{
            updatedBal = newBalance;
            BA2.setAccountBalance(updatedBal);
        }
       return updatedBal;
	}

}
