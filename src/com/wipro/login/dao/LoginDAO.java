package com.wipro.login.dao;

import com.wipro.login.model.Login;

public interface LoginDAO {

	Login doLogin(int userId,String password);
}
