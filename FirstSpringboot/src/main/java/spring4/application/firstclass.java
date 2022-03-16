package spring4.application;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
//@ComponentScan("spring1")
@SpringBootApplication(scanBasePackages= {"spring4"})
public class firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SpringApplication.run(firstclass.class, args);
		
	}
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("spring4"))              
          .paths(PathSelectors.ant("/api/*"))                          
          .build()
          .apiInfo(apiDetails());
    }
	private ApiInfo apiDetails() {
		return new ApiInfo(
	              "Topic Api",
	              "Api for My  Topics spring boot Project",
	              "Version 1.0.0",
	              "Free To Use",
	              new springfox.documentation.service.Contact("Adarsh Gour", "Rudra1234ag@gmail.com", "a@b.com"),
	              "A license given",
	              "http://Peero.com", 
	              Collections.emptyList());
	}

}
