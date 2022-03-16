package AdminProduct.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import AdminProduct.pojo.Admin;

public interface AdminRepository extends MongoRepository<Admin,Long> {

	

}
