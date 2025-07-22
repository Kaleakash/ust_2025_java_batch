package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {

	LoginDao ld = new LoginDao();

	public String signIn(Login login) {

		return ld.checkLoginFromDb(login);
	}
}
