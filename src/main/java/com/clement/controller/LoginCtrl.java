package com.clement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clement.domain.RPGUser;
import com.clement.service.AppService;

@Controller
public class LoginCtrl {
	
	@Autowired
	private AppService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(RPGUser user, HttpServletRequest request) {
		
		RPGUser clientUser = service.validateLogin(user);
		
		if (clientUser != null) {
			// store the valid user into the session
			HttpSession session = request.getSession(); // create one or get existing
			session.setAttribute("user", clientUser);

			return "redirect: home";

		} else {

			return "redirect: login";
		}
		
	}
	
	
	
	
	
	
	
	
}
