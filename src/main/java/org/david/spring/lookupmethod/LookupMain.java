package org.david.spring.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author david
 */
public class LookupMain {
    public static void main(String[] args) {
//        byXmlMetadata();
          byAnnoMetadata();
    }

    private static void byAnnoMetadata() {
        ApplicationContext context=new AnnotationConfigApplicationContext(LookupConfig.class);
        GetBeanTest bean = context.getBean(GetBeanTest.class);
        bean.showMe();
    }

    private static void byXmlMetadata(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/lookupTest.xml");
        GetBeanTest getBeanTest = (GetBeanTest) context.getBean("getBeanTest");
        getBeanTest.showMe();
    }
}
