package com.login.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login(){
		return "redirect:pages/login.jsp";
	}

	@RequestMapping(value="pages/userCheck", method = RequestMethod.POST)
	public String userCheck(ModelMap model, HttpServletRequest request) {
		String name =request.getParameter("name");
		String pwd =request.getParameter("pwd");
		System.out.println("hhhh");
		boolean bool = loginService.validateLoginCredentials(name, pwd);
		System.out.println("The value of bool is"+bool);
		if(bool)
			model.addAttribute("message", "Successfully logged in.");
		else{
			model.addAttribute("message", "Username or password is wrong.");
		}
		
		return "redirect:success.jsp";
	
//	@RequestMapping(value="login", method = RequestMethod.GET)
//	public String login(){
//		return "redirect:pages/login.jsp";
//	}
//
//	@RequestMapping(value="pages/userCheck", method = RequestMethod.POST)
//	public String userCheck(ModelMap model, HttpServletRequest request) {
//		String name=request.getParameter("name");
//		String pwd=request.getParameter("pwd");
//		if("concretepage".equalsIgnoreCase(name)&&"concretepage".equalsIgnoreCase(pwd)){
//			model.addAttribute("message", "Successfully logged in.");
//			
//		}else{
//			model.addAttribute("message", "Username or password is wrong.");
//		}
//		return "redirect:success.jsp";
//	}
//	
	}
}