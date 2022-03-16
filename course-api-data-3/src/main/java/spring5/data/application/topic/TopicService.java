package spring5.data.application.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepo;
	
	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		 List<Topic>topics=new ArrayList<>();
		 topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	
	 public Optional<Topic> getTopics(String id) {
	  return topicRepo.findById(id);
	  
	  }
	 
	
	  public void deleteTopics(String id) { // TODO Auto-generated method stub
	  topicRepo.deleteById(id); }  
	  
	public void addTopics(Topic topic) { // TODOAuto-generated method stub 
	  topicRepo.save(topic); }
	
	
	


	public void updateTopics(String id, Topic topic) {
		// TODO Auto-generated method stub
		 topicRepo.save(topic);
	}
	 
}
	 

