package com.wipro.login.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.login.model.Login;

@Repository("loginDao")
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public Login doLogin(int userId, String password) {
		Login login = (Login) sessionFactory.getCurrentSession().get(Login.class, userId);
		if(login!=null && login.getPassword().equals(password)){
			return login;
		}
		return null;
	}
	

}
