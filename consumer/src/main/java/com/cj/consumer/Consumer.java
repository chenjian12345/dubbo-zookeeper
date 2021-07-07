package com.cj.consumer;

import com.cj.api.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println("consumer");
        System.out.println(helloService.sayHello("consumer1"));
    }
}
