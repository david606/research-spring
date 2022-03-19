package org.david.spring.lookupmethod;

import org.springframework.stereotype.Component;

/**
 * @author david
 */
@Component("teacher")
public class Teacher extends User{
    @Override
    public void showMe() {
        System.out.println("I am a teacher!");
    }
}
