package spring5.data.application.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
    private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
	return topicservice.getAllTopics();}
	
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicservice.getTopics(id);
	}
	//to get specific value based on id from table
	
	@RequestMapping(method = RequestMethod.POST ,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		 topicservice.addTopics(topic);
	}
	//to Add (Post)specific value based in table
	
	@RequestMapping(method = RequestMethod.PUT ,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		 topicservice.updateTopics(id,topic);
	}
	//to update and delete (Put)specific json value based in table
	
	@RequestMapping(method = RequestMethod.DELETE ,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		 topicservice.deleteTopics(id);
	}
}

