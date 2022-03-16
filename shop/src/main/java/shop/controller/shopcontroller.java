package shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import shop.pojo.Products;
import shop.pojo.User;
import shop.repository.shopRepository;

@RestController
public class shopcontroller {
	
@Autowired
private shopRepository repo; 

@PostMapping("/addproduct")
public User placeOrder(@RequestBody User user) {
	return repo.save(user);
	}
@GetMapping("/product/{Name}")
public List<User> getUserName(@PathVariable String Name){
	return repo.findByName(Name);	
}
@GetMapping("/allProducts/")
public List<User> getAllUserProducts(){
repo.findAll();
return getAllUserProducts();
}
@PutMapping("/product/{Name}")
public String updateUserName(@RequestBody User user ,@PathVariable String Name){
	user.setName(Name);
	repo.save(user);
	return "Updated:"+user.getProducts() ;	
}
@DeleteMapping("/product/{Name}")
public String DeleteUserProduct(@PathVariable String Name){
	repo.deleteByName(Name);
	return "Deleted:"+Name;
	}
}
