package jwtsecurity.payload.response;

import java.util.List;

public class JwtResponse {
private String jwt;
private String id;
private String usename;
private String email;
private List<String> roles;




	
	public JwtResponse(String jwt, String id, String usename, String email, List<String> roles) {
	super();
	this.jwt = jwt;
	this.id = id;
	this.usename = usename;
	this.email = email;
	this.roles = roles;
}

public JwtResponse() {
		
	}

public String getJwt() {
	return jwt;
}

public void setJwt(String jwt) {
	this.jwt = jwt;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getUsename() {
	return usename;
}

public void setUsename(String usename) {
	this.usename = usename;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<String> getRoles() {
	return roles;
}

public void setRoles(List<String> roles) {
	this.roles = roles;
}


}
