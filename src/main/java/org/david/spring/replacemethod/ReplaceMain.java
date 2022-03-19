package org.david.spring.replacemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author david
 */
public class ReplaceMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/replaceMethodTest.xml");
        TestChangeMethod bean = (TestChangeMethod) context.getBean("testChangeMethod");
        bean.changeMe();
    }
}
