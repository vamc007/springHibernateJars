package com.cognizant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Excercise;

@Controller
public class anotherController {

	@RequestMapping(value="/hello")
	public String hello(@ModelAttribute("exercise")Excercise excercise){
		System.out.println("Hello method"+excercise.getMinutes());
		return "next";
	}
}
