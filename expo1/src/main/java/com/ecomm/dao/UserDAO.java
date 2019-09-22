package com.ecomm.dao;

import java.util.List;

import com.ecomm.model.UserDetail;

public interface UserDAO{
	
	public boolean registeruser(UserDetail userDetail);
	public UserDetail getUser(String username);
	public boolean updateUser(UserDetail userDetail);
}