package spring4.cont2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class hello2controller {
	
	@Autowired
	private topicservice topicservice;
	
	@RequestMapping("/topics")
public List<Topic> getalltopics(){
	return topicservice.getalltopics();
	/*(NOT A GOOD PRACTICE AS WE NEED TO MAKE CHANGS IN THIS LIST  SO CREATING A SERVICE IS BETTER!)
	 * return Arrays.asList( new
	 * Topic("s1","spring-core","easy hai but time lagta hai"), new Topic("s2",
	 * "spring-MVC","error ka ghar hai pr maza ajaata hai ek baarkrne lago to"), new
	 * Topic("s3","spring-boot","easy hai aur chal raha hai.") );
	 */
	
	}
	@RequestMapping("/topics/{id}")
	public Topic gettopic(@PathVariable String id) {
		return topicservice.gettopic(id);
	}
	//to get specific value based on id from table
	
	@RequestMapping(method = RequestMethod.POST ,value="/topics")
	public void Addtopic(@RequestBody Topic topic) {
		 topicservice.addtopic(topic);
	}
	//to Add (Post)specific value based in table
	
	@RequestMapping(method = RequestMethod.PUT ,value="/topics/{id}")
	public void Updatetopic(@RequestBody Topic topic,@PathVariable String id) {
		 topicservice.updatetopic(id,topic);
	}
	//to update and delete (Put)specific json value based in table
	
	@RequestMapping(method = RequestMethod.DELETE ,value="/topics/{id}")
	public void Deletetopic(@PathVariable String id) {
		 topicservice.deletetopic(id);
	}
}
