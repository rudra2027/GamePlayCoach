package jwtsecurity.payload.request;

import java.util.Set;

public class SignupRequest {
private String username;
private String email;
private CharSequence password;
private Set<String> roles;

public SignupRequest() {}


	public SignupRequest(String username, String email, CharSequence password, Set<String> roles) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
	this.roles = roles;
}

	
	public void setUsername(String username) {
		this.username = username;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPassword(CharSequence password) {
		this.password = password;
	}


	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}


	public String getUsername() {
		return username;
	}


	public String getEmail() {
		return email;
	}


	public CharSequence getPassword() {
		return password;
	}


	public Set<String> getRoles() {
		return roles;
	}


	

}
