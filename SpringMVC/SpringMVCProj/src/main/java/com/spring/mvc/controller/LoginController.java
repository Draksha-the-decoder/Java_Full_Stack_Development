 package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.LoginAction;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView authenticate(HttpServletRequest request)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String result = LoginAction.verifyUser(username,password);//invoke Model/Service/Action class
		if (result.equals("success"))
			return new ModelAndView("success.jsp","username",username);//invoke View 
		else
		    return new ModelAndView("failure.jsp");//invoke View		
	}
}