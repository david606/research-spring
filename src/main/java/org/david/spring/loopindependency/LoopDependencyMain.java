package org.david.spring.loopindependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoopDependencyMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/loopDependencyTest.xml");
        TestA testA = (TestA) context.getBean("testA");
        System.out.println("testA = " + testA.getTestB());
    }
}
