package spring5.data.application.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring5.data.application.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
    private CourseService courseservice;
	
	@RequestMapping("/topics/{id}/course")
	public List<Course> getAllCourse(@PathVariable String id){
	return courseservice.getAllCourse(id);}
	
	@RequestMapping("/topics/{topicId}/course/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		return courseservice.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST ,value="/topics/{topicId}/course")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseservice.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT ,value="/topics/{topicId}/course/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id ) {
		course.setTopic(new Topic(topicId,"",""));
		courseservice.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE ,value="/topics/{topicId}/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseservice.deleteCourse(id);
	}
}
