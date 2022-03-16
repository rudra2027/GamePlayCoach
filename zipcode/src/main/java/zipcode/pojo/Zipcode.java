package zipcode.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString
@Document(collection="zipcode")
public class Zipcode {
@Id
private long zipcode;
private String  state;
private String city;
private String country;


public Zipcode() {}


public Zipcode(long zipcode, String state, String city, String country) {
	super();
	this.zipcode = zipcode;
	this.state = state;
	this.city = city;
	this.country = country;
}

public long getZipcode() {
	return zipcode;
}
public void setZipcode(long zipcode) {
	this.zipcode = zipcode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
