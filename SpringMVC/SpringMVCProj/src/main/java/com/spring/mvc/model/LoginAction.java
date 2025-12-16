package com.spring.mvc.model;

public class LoginAction {
	public static String verifyUser(String username, String password)
	{
		if (username.equals("admin") && password.equals("admin"))
			return "success";
		else
			return "failure";
	}

}
