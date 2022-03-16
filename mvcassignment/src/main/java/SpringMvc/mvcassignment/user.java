package SpringMvc.mvcassignment;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class user {
@NotNull(message="must not be Null")
@NotEmpty(message="{0} must not be Empty")
@Pattern( regexp = "[a-zA-Z0-9/^\\S]{8}{10}",message="Alphanumeric of length{2}-{1}")
private String name;
@NotNull(message="must not be Null")
@NotEmpty(message="{0} must not be Empty")
private String email;
@Size(min=5,max=10,message="Please enter {0} of length {2}-{1} alphanumerics")
@Pattern(regexp="[(?=.{10,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?\\W).*$]",message="Atleat one upperCase And LowerCase needed with Special Character")
private String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
