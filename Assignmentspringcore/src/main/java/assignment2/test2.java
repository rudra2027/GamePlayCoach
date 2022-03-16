package assignment2;

import org.springframework.aop.framework.AopContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

public static void main(String[] args) {
AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring2.xml");
context.registerShutdownHook();
Question Que=(Question) context.getBean("Question");
Que.output();
}
}
