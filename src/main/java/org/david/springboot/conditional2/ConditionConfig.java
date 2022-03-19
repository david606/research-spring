package org.david.springboot.conditional2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author david
 * matchIfMissing = true 如果没有匹配上(未设置)也会加载，默认是 false
 */
@Configuration
//@ConditionalOnProperty(value = "david.is.good.man", havingValue = "true", matchIfMissing = false)
public class ConditionConfig {

    @Bean
    @ConditionalOnProperty(value = "david.is.good.man", havingValue = "true", matchIfMissing = false)
    public GoodManBean getGoodMan() {
        return new GoodManBean();
    }

    @Bean
    @ConditionalOnBean(value = GoodManBean.class)
//    @ConditionalOnBean(value = TestOnBeanNotInContainer.class)
    public TestOnBean getTestOnBea(){
       return new TestOnBean();
    }

    @Bean
    @ConditionalOnResource(resources = "testConditionalOnResource.properties")
//    @ConditionalOnResource(resources = "notExistsResource.properties")
    public TestOnResource getTestOnResource(){
        return new TestOnResource();
    }
}
