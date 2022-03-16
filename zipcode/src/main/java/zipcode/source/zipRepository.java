package zipcode.source;

import org.springframework.data.mongodb.repository.MongoRepository;

import zipcode.pojo.Zipcode;

public interface zipRepository extends MongoRepository<Zipcode,Long>{

}
