package com.shsxt.service;

import com.shsxt.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserService01 {
    private UserDao userDao;
    private String host;
    private Integer port;
    public List<String> list;
    private Set<String> set;
    private Map<String, Object> map;
    private Properties properties;
    public void setHost(String host) {
        this.host = host;
    }


    public void setPort(Integer port) {
        this.port = port;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void printList() {
        list.forEach(s -> System.out.println(s));
    }

    public void printSet() {
        set.forEach(s -> System.out.println(s));
    }

    public void printMap() {
        map.forEach((k,v)-> System.out.println(k+","+v));
    }
    public  void  printProperties(){
properties.forEach((k,v)-> System.out.println(k+","+v));
    }

    public void test() {
        System.out.println("TestUserService01......");
        userDao.testDao();
        System.out.println(host);
        System.out.println(port);
        printList();
        printSet();
        printMap();
        printProperties();
    }

}

