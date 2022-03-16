package customer.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="customer")
@ToString
public class Customer {
@Id
private int customerId;
private String customerName;
private String  customerAddress;
private long zipcode;

public Customer(){}

public Customer(int customerId, String customerName, String customerAddress, long zipcode) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.zipcode = zipcode;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public long getZipcode() {
	return zipcode;
}
public void setZipcode(long zipcode) {
	this.zipcode = zipcode;
}

}






