package com.molychina.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.molychina.model.User;


@Service("userService")
public class UserService {
	
	private Logger log = Logger.getLogger(UserService.class);
	
	// @Resource 
	// private UserDao userDao;

	public boolean add(String uname) {
		log.info("UserService.add()");
//		System.out.println("UserService.add()");
		User u = new User();
		u.setUname(uname);
		// userDao.check(u);
		// userDao.add(u);
		return true;
	}

	public boolean check(String uname, String passwd) {
		log.info("UserService.check()");
//		System.out.println("UserService.check()");
		User u = new User();
		u.setUname(uname);
		u.setPasswd(passwd);
		// check
		// userDao.check(u);
		return true;
	}

	// public UserDao getUserDao() {
	// return userDao;
	// }

	// public void setUserDao(UserDao userDao) {
	// this.userDao = userDao;
	// }

}
