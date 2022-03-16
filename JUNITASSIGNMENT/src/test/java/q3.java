import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class q3 {
	BankAccount bc;
@BeforeEach
void init() {bc=new BankAccount(7600);}
@Test
public void someTest() {
	assertThrows(InsufficientFundsException.class, ()-> bc.Withdraw(8000));
	
}



}
