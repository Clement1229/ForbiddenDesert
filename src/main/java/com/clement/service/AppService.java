package com.clement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clement.dao.Dao;
import com.clement.domain.RPGUser;

@Service(value = "AppService")
@Transactional
public class AppService {
	
	private RPGUser user;
	
	@Autowired
	private Dao dao;
	
	public RPGUser getUser(RPGUser us) {
		return dao.getUser(us);
	}

	public RPGUser validateLogin(RPGUser us) {
		System.out.println("validateLogin();");
		user = dao.getUserByUsername(us);
		
		if(user == null) {
			return null;
		} else if(user.getuPassword().equals(us.getuPassword())){
			return user;
		}else {
			return null;
		}
		
	}
}

