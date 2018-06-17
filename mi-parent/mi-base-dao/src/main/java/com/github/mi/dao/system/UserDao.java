package com.github.mi.dao.system;

import java.util.List;

import com.github.mi.model.system.User;

public interface UserDao { 
	
	List<User> selectUsers();
}
