package springsecurity1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

@RequestMapping("/hi")
public String op() {
	return "Hello!";
}
}
