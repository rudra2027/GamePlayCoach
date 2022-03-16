package securitymon.controller;

import java.util.Collection;
import java.util.Iterator;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import securitymon.pojo.UserP;
import securitymon.pojo.authenticationRequest;
import securitymon.pojo.authenticationResponse;
import securitymon.repository.userRepository;

@RestController
public class authController {
	@Autowired
	private userRepository repo;
	@Autowired
	private AuthenticationManager manager;
	
@PostMapping("/register")
private ResponseEntity<?> register(@RequestBody authenticationRequest authReq){
	
	String username=authReq.getUsername();
	String password=authReq.getPassword();
    UserP user=new UserP();
	user.setUserName(username);
	user.setPassword(password);
	try {
		repo.save(user);
	} catch (Exception e) {
		return ResponseEntity.ok(new authenticationResponse("Error Registering:"+username));

	}
	
	
	return ResponseEntity.ok(new authenticationResponse("Successful Registration:"+username));
	}

@PostMapping("/auth")
private ResponseEntity<?> auth(@RequestBody authenticationRequest authReq){
	
	String username=authReq.getUsername();
	String password=authReq.getPassword();
	try {
		manager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

	} catch (BadCredentialsException e) {
		return ResponseEntity.ok(new authenticationResponse("Enter Correct Credentials"));

	}
	
	return ResponseEntity.ok(new authenticationResponse("Login Successful :"+username));

	


}
}
