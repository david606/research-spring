package org.david.spring.simpletest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author david
 */
public class SimpleMain {
    public static void main(String[] args) {
        BeanFactory bf=new XmlBeanFactory(new ClassPathResource("spring/application.xml"));
        Object testBean = bf.getBean("testBean");
        System.out.println("testBean = " + testBean);
    }
}
