package spring4.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class topicservice {
	
	@Autowired
	private TopicRepositories topicrepo;
	
	//new ArrayList<> Jodha kyuki jab add krenge tab format to banna chahiye na!
	private List<Topic>topic=new ArrayList<>(Arrays.asList(
			new Topic("s1","spring-core","easy hai but time lagta hai"),
			new Topic("s2","spring-MVC","error ka ghar hai pr maza ajaata hai ek baarkrne lago to"),
			new Topic("s3","spring-boot","easy hai aur chal raha hai.")
			));
	
	/*public Topic gettopic(String id) {
		//return topic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		// if user enters something as localhost:8083/topics/spring->so it should fetch first Topic from list with the name spring and show
		
		
	}
	
	public void addtopic(Topic topic2) {
		// remember void is the type not TOPIC
	   //  topic.add(topic2);
		//topicrepo.save(topic2);
	      //return (Topic) topic;
	      //postman me POST method deke firr  content type- application/json daalke headerme firr body>rw me json format me detail deke send krdena  firr usika GET method krke check krna
	}
*/
	public List<Topic> getalltopics() {
		// TODO Auto-generated method stub
		//return topic;
		List<Topic> topics=new ArrayList<>();
		 topicrepo.findAll().forEach(topics::add);
		 return topics;
	}
	/*public void updatetopic(String id,Topic topic2) {
		
		 * for(int i=0;i<topic.size();i++) { Topic t=topic.get(i);
		 * if(t.getId().equals(id)) { topic.set(i, topic2); return;
		 
	}
		}
		// remember void is the type not TOPIC
	      }

	public void deletetopic(String id) {
		// TODO Auto-generated method stub
		//topic.removeIf(t->t.getId().equals(id));
		for(int i=0;i<topic.size();i++) {
			Topic t=topic.get(i);
			if(t.getId().equals(id)) {
				topic.remove(id);
				return;
			}
				}*/
	
}
