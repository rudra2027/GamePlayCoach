package SpringMvc.mvcassignment;

public class simpleint {
private int  principal;
private int rate;
private int time;
private int si;



public int getPrincipal() {
	return principal;
}
public void setPrincipal(int principal) {
	this.principal = principal;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public int getTime() {
	return time;
}
public void setTime(int time) {
	this.time = time;
}

public int Si() {
	int si=(principal*rate*time)/100;
	return si;
}

  
  }
 
