package customer.controller;

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

import customer.pojo.Customer;
import customer.repository.customerRepository;

@RestController
public class cutomerController {
@Autowired
private customerRepository repo;
	
@GetMapping("/allCustomer")
public List<Customer> getAllCustomers() {
	return repo.findAll();
}
@GetMapping("/customer/{customerId}")
public Optional<Customer> getCustomer(@PathVariable int customerId) {
	return repo.findById(customerId);
	
}
@PostMapping("/customer")
public String addCustomer(@RequestBody Customer cust) {
	repo.save(cust);
	return"Customer Name:"+cust.getCustomerName()+",\n Customer Address:"+cust.getCustomerAddress();
}
@PutMapping("/customer/{customerId}")
public Customer updateCustomer(@RequestBody Customer cust ,@PathVariable int customerId) {
	cust.setCustomerId(customerId);
	repo.save(cust);
	return cust;
}
@DeleteMapping("/customer/{customerId}")
public String deleteCustomer(@PathVariable int customerId) {
	repo.deleteById(customerId);
	return "deleted:"+customerId;
}
}
