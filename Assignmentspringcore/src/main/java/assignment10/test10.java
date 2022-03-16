package assignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext cont=new ClassPathXmlApplicationContext("Spring10.xml");
ContextAwareExample contextawareex =(ContextAwareExample) cont.getBean("ContextAware");
contextawareex.show();
ContextAwareExample contextawareex1 =(ContextAwareExample) cont.getBean("ContextAware1");
contextawareex1.show();
	}

}
