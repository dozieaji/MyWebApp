package com.dozie.MyWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;




// Spring Boot Jpa MVC H2 Example

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody 
	public ModelAndView home(Student student) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",student);
		mv.setViewName("home");
		
		return mv;
		
	}

}



//Making Request using HttpServelet

/*Using HttpSession to send data on the Server
 * @Controller public class HomeController {
 * 
 * @RequestMapping("home") public String home(@RequestParam("name" String
 * myName, HttpSession session) {
 * 
 * HttpSession session = req.getSession(); String name =
 * req.getParameter("name"); System.out.println("Hi" + name);
 * session.setAttribute("name",name);
 * 
 * return "home";
 * 
 * }
 * 
 * }
 */

//Web App Using Spring Boot Model Object
//Using ModelAndView object to send data and return view

/*
 * @Controller public class HomeController {
 * 
 * @RequestMapping("home") // @ResponseBody public ModelAndView home(Student
 * student) {
 * 
 * ModelAndView mv = new ModelAndView(); mv.addObject("obj",student);
 * mv.setViewName("home");
 * 
 * return mv;
 * 
 * }
 * 
 * }
 */
