package com.example.dubboconsumer.controller;

import com.example.dubboapi.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Hao
 * @date 2020/8/10
 */
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("dubbo");
        System.out.println(helloService.sayHello("console  dubbo"));
        return hello;
    }
}
