package com.icr7.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		 return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
   
	 //need a controller method to read form data and
	 //add data to the model
	@RequestMapping("/processForm2")
	public String CaptialLetter(HttpServletRequest request, Model model) {
	    
		// read the request parameter from html Form 
		String theName =request.getParameter("studentName");
		
		// convert the data to all caps
		theName =theName.toUpperCase();
		
		//create the message
		String result = "yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
	return "helloworld";}
	
	 
}
