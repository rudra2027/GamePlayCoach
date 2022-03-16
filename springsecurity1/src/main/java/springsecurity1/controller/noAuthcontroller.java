package springsecurity1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class noAuthcontroller {
	@GetMapping("/heya")
	public String authcontroller() {
		return "Hello Auth Controller!";
	}
}
