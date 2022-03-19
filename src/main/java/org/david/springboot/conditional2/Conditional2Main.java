package org.david.springboot.conditional2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author david
 */
@SpringBootApplication
public class Conditional2Main {
    public static void main(String[] args) {
//        conditionalOnProperty();
//        conditionalOnBean();
        conditionalOnResource();
    }

    private static void conditionalOnResource() {
        ConfigurableApplicationContext context = SpringApplication.run(Conditional2Main.class);
        TestOnResource testOnResource = context.getBean(TestOnResource.class);
        System.out.println("testOnResource = " + testOnResource);
    }

    private static void conditionalOnBean() {
        ConfigurableApplicationContext context = SpringApplication.run(Conditional2Main.class);
        TestOnBean testOnBean = context.getBean(TestOnBean.class);
        System.out.println("testOnBean = " + testOnBean);
    }

    private static void conditionalOnProperty(){
        ConfigurableApplicationContext context = SpringApplication.run(Conditional2Main.class);
        GoodManBean goodManBean= context.getBean(GoodManBean.class);
        System.out.println("goodManBean = " + goodManBean);
    }
}
