package shop.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import shop.pojo.User;

public interface shopRepository extends MongoRepository<User,Integer>{

	List<User> findByName(String name);

	void deleteByName(String name);

}
