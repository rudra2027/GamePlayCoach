package spring5.data.application.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepo;


	
	 public Optional<Course> getCourse(String id) {
	  return courseRepo.findById(id);
	  
	  }
	 
	
	  public void deleteCourse(String id) { // TODO Auto-generated method stub
		  courseRepo.deleteById(id); }  
	  
	public void addCourse(Course course) { // TODOAuto-generated method stub 
		courseRepo.save(course); }
	
	
	


	public void updateCourse(Course course) {
		courseRepo.save(course);
	}


	public List<Course> getAllCourse(String topicId) {
		 List<Course>courses=new ArrayList<>();
		 courseRepo.findByTopicId(topicId)
		 .forEach(courses::add);
		return courses;
	}






	 
}
	 

