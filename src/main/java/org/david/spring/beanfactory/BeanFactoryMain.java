package org.david.spring.beanfactory;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryMain {
    public static void main(String[] args) {
//        beanFactory();
        applicationContext();
    }

    private static void applicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/beanFactoryTest.xml");
    }

    private static void beanFactory() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/beanFactoryTest.xml"));
    }
}
