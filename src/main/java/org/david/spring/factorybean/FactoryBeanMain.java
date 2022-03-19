package org.david.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author david
 */
public class FactoryBeanMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/factoryBeanTest.xml");
        Car car = (Car) context.getBean("car");
        System.out.println("car = " + car);
    }
}
