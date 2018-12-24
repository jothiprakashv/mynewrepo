package com.wipro.login.service;

import com.wipro.login.model.Login;

public interface LoginService {

	Login doLogin(int userId,String password);
}
