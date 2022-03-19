package org.david.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

/**
 * @author david
 */
@SpringBootApplication
public class StarterMain {
    public static void main(String[] args) {
//        Stream.of(100, 200, 300, 400, 500)
//                .mapToLong(e -> e * 10)
//                .filter(e -> e > 2000)
//                .forEach(System.out::println);
        SpringApplication.run(StarterMain.class,args);
    }
}
