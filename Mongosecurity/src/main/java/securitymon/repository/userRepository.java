package securitymon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import securitymon.pojo.UserP;
import securitymon.pojo.authenticationRequest;

@Repository
public interface userRepository extends MongoRepository<UserP,Integer>  {

	

	UserP findByuserName(String userName);



}
