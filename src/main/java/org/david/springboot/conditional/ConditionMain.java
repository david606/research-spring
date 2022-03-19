package org.david.springboot.conditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author david
 */
@SpringBootApplication
public class ConditionMain {
    public static void main(String[] args) {
//        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        ConfigurableApplicationContext context = SpringApplication.run(ConditionMain.class, args);
        TestClass testClass = context.getBean(TestClass.class);
        System.out.println("testClass = " + testClass);
    }
}
