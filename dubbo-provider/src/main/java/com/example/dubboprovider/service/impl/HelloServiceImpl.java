package com.example.dubboprovider.service.impl;

import com.example.dubboapi.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Yang Hao
 * @date 2020/8/10
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello  " + name;
    }
}
