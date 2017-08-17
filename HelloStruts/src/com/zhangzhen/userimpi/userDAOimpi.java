package com.zhangzhen.userimpi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.zhangzhen.dao.userDAO;
import com.zhangzhen.users.user;

public class userDAOimpi implements userDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	static
	{
		Configuration config =new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
	}
	
	public void save(user user) {
		// TODO Auto-generated method stub
		session.save(user);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	public user getUser(String username) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
