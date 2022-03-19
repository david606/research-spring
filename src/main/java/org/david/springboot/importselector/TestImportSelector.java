package org.david.springboot.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 1.把返回的类名的相关类，放到IOC容器中
 * 2.如果是配置类（可以不声明@Configuration）,则把其下的所有 Bean 加入的容器中
 *
 * @author david
 */
public class TestImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                MyFirstClass.class.getName(), MySecondClass.class.getName(), MyConfiguration.class.getName()
//                MyFirstClass.class.getName(), MySecondClass.class.getName()
        };
    }
}
