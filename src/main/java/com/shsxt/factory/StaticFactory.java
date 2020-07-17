package com.shsxt.factory;

import com.shsxt.service.UserService;

public class StaticFactory {
    public static UserService createService(){
        return new UserService();
    }
}
