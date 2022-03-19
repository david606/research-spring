package org.david.springboot.importselector;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 导入自己实现的 ImportSelector
 * @author david
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import(TestImportSelector.class)
public @interface EnableAutoConfiguration {
}
