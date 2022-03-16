package authentication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import authentication.pojo.User;

public interface userRepository extends MongoRepository <User,String>{

}
