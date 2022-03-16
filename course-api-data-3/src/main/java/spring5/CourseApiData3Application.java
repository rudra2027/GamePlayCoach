package spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication /* (scanBasePackages={"spring4.data.application"}) */
@EntityScan("spring5")
@EnableJpaRepositories("spring5")
public class CourseApiData3Application {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiData3Application.class, args);
	}

}
