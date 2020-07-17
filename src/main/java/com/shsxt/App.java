package com.shsxt;

import com.shsxt.dao.UserDao;
import com.shsxt.service.UserService;
import com.shsxt.service.UserService01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("autoI.xml");
        UserService userService= (UserService) ac.getBean("userService");
        userService.test();
//        UserDao userDao= (UserDao) ac.getBean("userDao01");
//        userDao.testDao();

    }
}
