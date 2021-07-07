package com.cj.provider.serviceimpl;

import com.cj.api.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello!" + name;
    }
}
