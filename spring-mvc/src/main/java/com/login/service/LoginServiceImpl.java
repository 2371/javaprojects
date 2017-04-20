package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.dao.LoginDao;

@Service ("LoginService")
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	private LoginDao loginDao;

	public boolean validateLoginCredentials(String userId, String password) {
		// TODO Auto-generated method stub
		boolean check = loginDao.checkCredentials(userId, password);
		
		return check;
	}

}
