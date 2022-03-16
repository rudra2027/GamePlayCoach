import java.util.Scanner;
import java.lang.UnsupportedOperationException;
public class q1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No. Dividend: ");
	int i=sc.nextInt();
	System.out.println("Enter No. Divisor: ");
	int j=sc.nextInt();
	try {
		int d=i/j;
		System.out.println("Result: "+d);
		 throw new UnsupportedOperationException("Invalid operation .");
	}
	catch(java.lang.UnsupportedOperationException e){//ArithmeticException  e
		System.out.println("Error:"+e.getMessage());
	    System.out.println("Error:"+e);
	   // throw new UnsupportedOperationException("Invalid operation .");
	    }

}
}
