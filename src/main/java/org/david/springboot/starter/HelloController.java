package org.david.springboot.starter;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    RedissonClient redissonClient;
//    @Autowired
//    HelloService helloService;

    @RequestMapping("/")
    public String hello(){
        System.out.println("redissonClient = " + redissonClient);
        return "hello";
//        return helloService.sayHello();
    }
}
