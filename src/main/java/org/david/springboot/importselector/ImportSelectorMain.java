package org.david.springboot.importselector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author david
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ImportSelectorMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(ImportSelectorMain.class, args);
        MyFirstClass firstClass = context.getBean(MyFirstClass.class);
        System.out.println("firstClass = " + firstClass);

        ThirdClass thirdClass = context.getBean(ThirdClass.class);
        System.out.println("thirdClass = " + thirdClass);
    }
}
