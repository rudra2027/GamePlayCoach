import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MINMAXFINDER {
	private int min,max;

	public MINMAXFINDER(int min, int max) {
		this.min = min;
		this.max = max;
	}
	public List<Integer> findminmax(List<Integer> inputList){
		List<Integer> list = new ArrayList<Integer>();
		list.add(Collections.min(inputList));
		list.add(Collections.max(inputList));
	
		return list;
	}
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	
/*public void findminmax(){
	Scanner sc=new Scanner(System.in);
	List<Integer> l1=new ArrayList<Integer>();
	System.out.println("Enter the array elements:");
	int a=sc.nextInt();l1.add(a);
	int b=sc.nextInt();l1.add(b);
	int c=sc.nextInt();l1.add(c);
	int d=sc.nextInt();l1.add(d);
	
	System.out.println(l1);
	System.out.println("___________________________________________");

	System.out.println("[min,max]:");
	int min = l1.get(0);
    int max = l1.get(0);
    int n = l1.size();
    for (int i = 1; i < n; i++) {
        if (l1.get(i) < min) {
            min = l1.get(i);
        }
    }

    // loop to find maximum from ArrayList
    for (int i = 1; i < n; i++) {
        if (l1.get(i) > max) {
            max = l1.get(i);
        }
    }
	List<Integer> l2=new ArrayList<Integer>();
	l2.add(min);
	l2.add(max);
	System.out.println(l2);

}*/
}
