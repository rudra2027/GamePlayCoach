package assignment10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextAwareExample implements ApplicationContextAware  {
private String name;
Check check;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Check getCheck() {
	return check;
}
public void setCheck(Check check) {
	this.check = check;
}
public void show() {
	System.out.println("name:"+getName()+","+"Subject Check 1)Hindi:"+getCheck().getHindi()+", 2)English"+getCheck().getEnglish());
}
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("application name "+applicationContext);
}

}
