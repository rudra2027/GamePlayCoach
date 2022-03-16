package spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

	@RequestMapping("/hello")
	public String Hello() {return "Namaskar Saheb";}

}
