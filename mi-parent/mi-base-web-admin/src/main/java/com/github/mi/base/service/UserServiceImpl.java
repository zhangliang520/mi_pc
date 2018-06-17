package com.github.mi.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.mi.dao.system.UserDao;
import com.github.mi.model.system.User;
import com.github.mi.service.system.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(value = "userService") 
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserDao userDao;
	
	@Override
	public PageInfo<User> findAllUser(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
        List<User> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;
	}

}