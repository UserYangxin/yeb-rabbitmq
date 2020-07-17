package com.shsxt.service;

import com.shsxt.dao.IUserDao;
import com.shsxt.dao.UserDao;
import com.shsxt.dao.UserDao01;
import com.shsxt.dao.UserDao02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;

public class UserService {

//    private UserDao userDao;
    private IUserDao iUserDao;
@Autowired
@Qualifier(value = "userDao01")
    public void setiUserDao(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

//    @Resource(name = "userDao01")
//
//    @Resource(name="userDao")
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }


    public void test() {
//        userDao.testDao();
        iUserDao.test();
        System.out.println("Hello UserService");
    }

}
