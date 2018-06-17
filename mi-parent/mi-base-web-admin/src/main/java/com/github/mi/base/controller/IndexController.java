package com.github.mi.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.mi.model.system.User;
import com.github.mi.service.system.UserService;
import com.github.pagehelper.PageInfo;

@RestController
public class IndexController {
	
	@Autowired
	private UserService userService;
	
    @RequestMapping("/")
    public PageInfo<User> index(){
      return userService.findAllUser(0, 20);
    }
}
