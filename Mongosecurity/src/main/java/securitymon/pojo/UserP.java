package securitymon.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class UserP {
@Id
private int id;
private String UserName;
private String Password;

public UserP() {}

public UserP(int id, String userName, String password) {
	super();
	this.id = id;
	this.UserName = userName;
	this.Password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}


}
