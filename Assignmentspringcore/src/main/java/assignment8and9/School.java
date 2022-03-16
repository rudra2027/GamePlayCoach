package assignment8and9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class School implements InitializingBean,DisposableBean {
	 private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	public void ct() {
		System.out.println("Name="+getName());
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Process to destroy after bean completed ");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Process to initialize before bean started");

	}
	
	public void init() {
		System.out.println("Process to initialize before EACH bean started via Manual init bean");

	}
	
	public void dest() {
		System.out.println("Process to destroy after EACH bean completed via Manual destroy bean");

	}
	@PostConstruct
    public void postConstruct(){
        System.out.println("init called via PostConstruct");
    }

    @PreDestroy
    public  void  preDestroy(){
        System.out.println("destroy called Via PreDestroy");
    }
}
