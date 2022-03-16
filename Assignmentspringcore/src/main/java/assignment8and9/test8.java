package assignment8and9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test8 {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring8.xml");
	context.registerShutdownHook();
	
	School sc1= (School)context.getBean("sc1");
    sc1.ct();

    School sc2= (School)context.getBean("sc2");
    sc2.ct();

    School sc3= (School)context.getBean("sc3");
    sc3.ct();
}
	
}
