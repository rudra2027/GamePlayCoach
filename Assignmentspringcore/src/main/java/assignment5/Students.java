package assignment5;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Students {
	private  int age;
    private String name;
    private School school;

    @Required
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return school;
	}

	@Resource(name="school1")
	public void setSchool(School school) {
		this.school = school;
	}
	 public void getStudentDetails(){
	        System.out.println("Name: "+getName());
	        System.out.println("Age: "+getAge());
	    }

	    public void getStudentDetailsUsingResource(){
	        System.out.println("Name: "+getName());
	        System.out.println("Age: "+getAge());
	        System.out.println("School: "+school.getName());
	        System.out.println("Total Students: "+school.getTotalStudent());
	    }
}
