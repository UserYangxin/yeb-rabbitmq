package com.shsxt.factory;

import com.shsxt.service.UserService;

public class Factory01 {

    public UserService createService() {
        return new UserService();
    }
}


