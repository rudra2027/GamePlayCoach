package customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import customer.pojo.Customer;

public interface customerRepository extends MongoRepository<Customer,Integer>{

}
