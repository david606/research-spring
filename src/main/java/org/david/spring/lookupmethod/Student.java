package org.david.spring.lookupmethod;

import org.springframework.stereotype.Component;

@Component("student")
public class Student extends User{

    @Override
    public void showMe(){
        System.out.println("I ad a student");
    }
}
