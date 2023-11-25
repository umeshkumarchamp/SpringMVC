package com.springmvc.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.Employee;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String test(HttpServletResponse response) {
		return "home";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String welcomePage(Employee emp,  Map<String, Employee> map) {
		
//		String name = req.getParameter("name");
//		String email = req.getParameter("email");
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		String contact = req.getParameter("contact");
		map.put("emp1", emp);
		return "welcome";
	}
}
