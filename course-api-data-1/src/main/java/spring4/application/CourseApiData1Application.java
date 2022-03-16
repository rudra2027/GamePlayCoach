package spring4.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"spring4"})
public class CourseApiData1Application {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiData1Application.class, args);
	}

}
