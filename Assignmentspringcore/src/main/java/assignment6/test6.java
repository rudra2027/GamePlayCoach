package assignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test6 {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring6.xml");
    DbConfig dbConfiguration = (DbConfig)context.getBean("dbConfig");
    dbConfiguration.show();
}
}
