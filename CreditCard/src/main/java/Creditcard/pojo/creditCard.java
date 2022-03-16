package Creditcard.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class creditCard {
private boolean valid=false;
private String type;

public creditCard() {}
public creditCard(boolean valid, String type) {
	super();
	this.valid = valid;
	this.type = type;
}
public boolean isValid() {
	return valid;
}
public void setValid(boolean valid) {
	this.valid = valid;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
