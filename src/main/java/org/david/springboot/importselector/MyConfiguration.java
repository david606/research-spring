package org.david.springboot.importselector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注意这个配置类没有 @Configuration 注解,将其通过ImportSelector 返回，则可以将其下的Bean放到IOC容器
 *
 * @author david
 */
public class MyConfiguration {
    @Bean
    public ThirdClass getThirdClass() {
        return new ThirdClass();
    }

    @Bean
    public FourthClass getFourthClass() {
        return new FourthClass();
    }
}
