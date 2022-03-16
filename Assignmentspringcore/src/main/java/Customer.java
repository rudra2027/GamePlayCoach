
public class Customer {
private int custid;
private String custname;
private int custcontact;
private Address custaddress;

public Customer(){}
public Customer(int custid, String custname, int custcontact, Address custaddress) {
	super();
	this.custid = custid;
	this.custname = custname;
	this.custcontact = custcontact;
	this.custaddress = custaddress;
}

public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public int getCustcontact() {
	return custcontact;
}
public void setCustcontact(int custcontact) {
	this.custcontact = custcontact;
}
public Address getCustaddress() {
	return custaddress;
}
public void setCustaddress(Address custaddress) {
	this.custaddress = custaddress;
}
public void show() {
	System.out.println("Name:"+getCustname()+","+"Id:"+getCustid()+","+"Contact:"+getCustcontact()+","+"Address:"+getCustaddress().getCity() +getCustaddress().getZip() +getCustaddress().getState() +getCustaddress().getCountry() +getCustaddress().getStreet());
}
}
