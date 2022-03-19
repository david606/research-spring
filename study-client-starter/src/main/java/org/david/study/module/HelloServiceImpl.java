package org.david.study.module;

import org.springframework.stereotype.Component;

/**
 * @author david
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "=============hello=================";
    }
}
