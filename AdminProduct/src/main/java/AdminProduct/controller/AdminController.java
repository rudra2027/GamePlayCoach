package AdminProduct.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import AdminProduct.pojo.Admin;
import AdminProduct.repo.AdminRepository;

@RestController
public class AdminController {
@Autowired
private AdminRepository repo;

@GetMapping("/allproducts")
public List<Admin> getAllProducts() {
	return repo.findAll();
}
@GetMapping("/product/{id}")
public Optional<Admin> getProduct(@PathVariable long id) {
	return repo.findById(id);
	
}
@PostMapping("/product")
public String addProduct(@RequestBody Admin admin) {
	repo.save(admin);
	return"Product Added:"+admin.getProductName();
}
@PutMapping("/product/{id}")
public Admin addProduct(@RequestBody Admin admin ,@PathVariable long id) {
	admin.setId(id);
	repo.save(admin);
	return admin;
}
@DeleteMapping("/product/{id}")
public String deleteProduct(@PathVariable long id) {
	repo.deleteById(id);
	return "deleted:"+id;
}
}
