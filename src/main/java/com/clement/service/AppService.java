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
}

