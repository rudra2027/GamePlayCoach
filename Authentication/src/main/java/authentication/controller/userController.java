package authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import authentication.pojo.User;
import authentication.repository.userRepository;

@RestController
public class userController {
	
	  @Autowired private userRepository repo;
	  
	  @PostMapping("/addUser") 
	  public String addUser(@RequestBody User user) {
	  repo.save(user); return"User Added:"+user.getName(); }
	  
	  @GetMapping("/allusers") 
	  public List<User> findUser(){ 
		  return repo.findAll();
	  } 
	  @PostMapping("/user/login")
	  public String Login(@RequestBody User user) { 
		  List<User> users = repo.findAll();
			
		  for (User other : users) {
	            if (other.getName().equals(user.getName())&& other.getPassword().equals(user.getPassword())) {
	                repo.save(user);
	                return "Login Succesful";
	            }
	        }        return "Invalid User";
	    }
	    
		  
}
	 
	
	/*@RequestMapping("/auth")
	public String userAuth(@ModelAttribute("User") User user)
	{
		boolean isValid=check(user.getName(),user.getPassword());
			if (isValid)	
			{
				return "Valid User";
				
			}
			else
			{
				return "Invalid User";
			}
	}

	private boolean check(String name, String password) {
		// TODO Auto-generated method stub
		if(name.contentEquals("Adarsh") && password.contentEquals("hello"))
		{
			return true;
		}
		else
		{
			return false;
		}*/
	
	
	

