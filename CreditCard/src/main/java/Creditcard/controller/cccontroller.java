package Creditcard.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Creditcard.service.ccService;

@RestController
public class cccontroller {
	/*
	 * @Autowired private ccService service;
	 */

@RequestMapping(value="/card/{cardNumber}", method=RequestMethod.GET)
public String cardValidate(@PathVariable("cardNumber") String card) {
	return ccService.validate(card);
}

}
