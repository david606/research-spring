package org.david.spring.lookupmethod;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class GetBeanTest {
    public void showMe() {
        this.getBean().showMe();
    }

    /**
     * 这个配置的功能是动态的将 `teacher` 所代表的 bean 作为 getBean的返回值
     *
     * @return User
     */
//    @Lookup("teacher")
    @Lookup("student")
    protected abstract User getBean();
}
