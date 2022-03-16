package calculator.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import calculator.pojo.Calc;

@RestController
public class CalcController {
	/*
	 * @Autowired RestTemplate template;
	 */
	@Autowired
	CalcService service;
	
	/*
	 * @RequestMapping(value = "/consume/calc", method=RequestMethod.POST) public
	 * String add(@RequestBody Calc ms) { HttpHeaders headers = new HttpHeaders();
	 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	 * 
	 * HttpEntity<Calc> entity = new HttpEntity<Calc>(ms,headers); return
	 * template.exchange("http://localhost:8083/calculator", HttpMethod.POST, entity,
	 * String.class).getBody(); }
	 */
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public long sum(@RequestBody Calc ms) {
		
		return service.add(ms.getN1(), ms.getN2());
	}
	@RequestMapping(value = "/subtract",method = RequestMethod.POST)
	public long subtract(@RequestBody Calc ms) {
		
		return service.subtract(ms.getN1(), ms.getN2());
	}
	@RequestMapping(value = "/multiply",method = RequestMethod.POST)
	public long multiply(@RequestBody Calc ms) {
		
		return service.multiply(ms.getN1(), ms.getN2());
	}
	@RequestMapping(value = "/divide",method = RequestMethod.POST)
	public double division(@RequestBody Calc ms) {
		
		return service.division(ms.getN1(), ms.getN2());
	}
	@RequestMapping(value = "/sqrt",method = RequestMethod.POST)
	public double sqrt(@RequestBody Calc ms) {
		
		return service.sqrt(ms.getN1());
	}
}
