package assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test5 {
	  public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("Spring5.xml");

	        // add  <bean class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor"/>
	        Students studentRequired = (Students)context.getBean("studentRequired");
	        studentRequired.getStudentDetails();


	        // add <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>
	        // in xml file
	        Students studentResource = (Students)context.getBean("studentResource");
	        studentResource.getStudentDetailsUsingResource();


	    }
}
