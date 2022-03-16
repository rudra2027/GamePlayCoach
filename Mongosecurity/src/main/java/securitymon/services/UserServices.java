package securitymon.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import securitymon.pojo.UserP;
import securitymon.repository.userRepository;

@Service
public class UserServices implements UserDetailsService{
	@Autowired
	private userRepository repo;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		UserP userFound=repo.findByuserName(userName);
		if(userFound==null)return null;
		String username2=userFound.getUserName();
		String password2=userFound.getPassword();
		return new User(username2,password2,null);
	}

}
