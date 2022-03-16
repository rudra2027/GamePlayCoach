package SpringMvc.mvcassignment;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Handller {
	@RequestMapping(value="/interest",method=RequestMethod.GET)
	public ModelAndView getinterest() {
		ModelAndView mv = new ModelAndView("interestform");
		/* mv.addObject("msg","Hello There! " ); */

		return mv;
		
}
	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) {
	 * binder.setDisallowedFields(new String[]{"regdate"}); //custom binding (here
	 * we dont want date to be shown to the user so uskoo bind mat karo aur kya! ) }
	 */
	 
@ModelAttribute
	public void addingModelAttribute(Model mv) {
	    mv.addAttribute("msg","Hello There! " );

	}
	@RequestMapping(value="/intout",method=RequestMethod.POST)
	public ModelAndView Success(/* @RequestParam Map<String,String> params */@Valid @ModelAttribute("simpleint1") simpleint simpleint1,BindingResult result) {
		if (result.hasErrors()) {  
			ModelAndView mv = new ModelAndView("interestform");
			/* if error this will return ui as admission form*/
			return mv;
		}
		
		/*
		 * String name=params.get("Student-Name"); String standard=params.get("Class");
		 * String roll=params.get("Roll");
		 */
		ModelAndView mv = new ModelAndView("intout");
		/* mv.addObject("msg","Hello There! " ); */
	    return mv;
		
	}
}
