package com.clement.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clement.domain.RPGUser;

@Repository
public class DaoImpl implements Dao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public RPGUser getUser(RPGUser user) {
		Session session = sessionFactory.getCurrentSession();
		return (RPGUser)session.get(RPGUser.class, user.getuId());
	}

	public RPGUser getUserByUsername(RPGUser us) {
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(RPGUser.class);
		crit.add(Restrictions.like("uUserName", us.getuUserName()));
		return (RPGUser) crit.uniqueResult();
	}

}
