package SpringMvc.mvcassignment;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Handller2 {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getlogin() {
		ModelAndView mv = new ModelAndView("login");
		

		return mv;
		
}
	
	 

	@RequestMapping(value="/Success",method=RequestMethod.POST)
	public ModelAndView Success(/* @RequestParam Map<String,String> params */@Valid @ModelAttribute("user1") user user1,BindingResult result) {
		System.out.println(user1.getEmail());
		if (result.hasErrors()) {  
			ModelAndView mv = new ModelAndView("login");
			return mv;
		}
		
		if(user1.getName().equals("Rudra") && user1.getPassword().equals("123456"))
		{
			ModelAndView model = new ModelAndView("Success");
			return model;
		}
		else {
			ModelAndView model = new ModelAndView("error");
			return model;
		}
		
	    }
}