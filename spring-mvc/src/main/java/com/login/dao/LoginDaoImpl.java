package com.login.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository("LoginRepository")
public class LoginDaoImpl implements LoginDao {

	Map<String, String> userCred = null;
	//List<Map<String, String>> userdb = null;
	public Map<String, String> insertData() {
		// TODO Auto-generated method stub
		userCred = new HashMap<String,String>();
		//userdb = new ArrayList<Map<String, String>>();
		userCred.put("robhert", "robert@123");
		userCred.put("sham", "sham@123");
		userCred.put("ram", "ram@123");
		userCred.put("joejoe", "joejoe@123");
		userCred.put("tesfay", "tesfay@123");
		userCred.put("lincy", "lincy@123");
		userCred.put("fincy", "fincy@123");
		userCred.put("semere", "semere@123");
		
		return userCred;
	}

	public boolean checkUserId(String userId) {
		// TODO Auto-generated method stub
		boolean exist = userCred.containsKey(userId);
		return exist;
	}

	public boolean checkCredentials(String userId, String password) {
		// TODO Auto-generated method stub
		insertData();
		boolean userExist = checkUserId(userId);
		if(userExist)
		{
			String pass = userCred.get(userId);
			if(pass.equals(password.trim()))
				return true;
		}
		else
		{
		  return false;
		}
		return false;
	}

}