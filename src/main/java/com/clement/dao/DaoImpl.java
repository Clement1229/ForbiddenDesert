package com.clement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.clement.domain.RPGUser;

public class DaoImpl implements Dao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public RPGUser getUser(RPGUser user) {
		Session session = sessionFactory.getCurrentSession();
		return (RPGUser)session.get(RPGUser.class, user.getuId());
	}

}
