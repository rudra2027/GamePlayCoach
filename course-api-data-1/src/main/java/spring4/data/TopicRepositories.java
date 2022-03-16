package spring4.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TopicRepositories extends CrudRepository<Topic,String> {

}
