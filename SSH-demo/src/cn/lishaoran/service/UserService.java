package cn.lishaoran.service;

import cn.lishaoran.dao.UserDao;



public class UserService {

	private UserDao userDao;
	
	
	
	
	
	public UserDao getUserDao() {
		return userDao;
	}





	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}





	public int userCount(){
		return userDao.getAllUser().size();
	}
	
	
}
