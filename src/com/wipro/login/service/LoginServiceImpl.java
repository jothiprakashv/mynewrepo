package com.wipro.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.login.dao.LoginDAO;
import com.wipro.login.model.Login;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;

	
	@Override
	public Login doLogin(int userId, String password) {
		return loginDAO.doLogin(userId, password);
	}

}
