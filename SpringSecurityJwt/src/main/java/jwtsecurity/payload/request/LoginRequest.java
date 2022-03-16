package jwtsecurity.payload.request;

public class LoginRequest {
private String username;
private CharSequence password;

public LoginRequest() {
}

public LoginRequest(String username, CharSequence password) {
	super();
	this.username = username;
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public CharSequence getPassword() {
	return password;
}
public void setPassword(CharSequence password) {
	this.password = password;
}

	

	

}
