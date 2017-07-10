package com.cognizant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {

	@RequestMapping(value="/greeting")
	public String hello(Model model){
		System.out.println("Starrt");
		model.addAttribute("message", "My first Message");
		System.out.println(" end");
		return "hello";
	}
}
