import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test1 {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("Spring1.xml");
	//BeanFactory fac=new XmlBeanFactory (new FileSystemResource("String.xml"));
Customer cust=(Customer) context.getBean("show");
cust.show();
Customer custom=(Customer) context.getBean("show1");
custom.show();
}
}
