package com.github.mi.service.system;

import com.github.mi.model.system.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
	
	 PageInfo<User> findAllUser(int pageNum, int pageSize);
}
