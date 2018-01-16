package com.clement.dao;

import org.springframework.stereotype.Repository;

import com.clement.domain.RPGUser;


public interface Dao {
	
	//Read
	public RPGUser getUser(RPGUser user);

}
