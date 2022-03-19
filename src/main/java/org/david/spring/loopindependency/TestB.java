package org.david.spring.loopindependency;

public class TestB {
    private TestC testC;

    public void setTestC(TestC testC) {
        this.testC = testC;
    }
}
