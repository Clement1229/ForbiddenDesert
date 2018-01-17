package com.clement;

import org.springframework.beans.factory.annotation.Autowired;

import com.clement.domain.RPGUser;
import com.clement.service.AppService;

public class Main {
	
	@Autowired
	static AppService service;
	@Autowired
	static RPGUser user;
	
	public static void main(String [] args) {
//		System.out.println("hello");
//		RPGUser user = new RPGUser(1);
//		RPGUser n = service.getUser(user);
////		System.out.println(service.getUser(user));
//		System.out.println("++++++++++++++++++" + n.getuFirstName());
	}
}
