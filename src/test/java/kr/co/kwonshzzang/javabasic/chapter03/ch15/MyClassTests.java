package kr.co.kwonshzzang.javabasic.chapter03.ch15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTests {
    @Test
    void start() {
        MyClass myClass = new MyClass();

        X xClass = myClass;
        xClass.x();

        Y yClass = myClass;
        yClass.y();

        MyClass iClass = myClass;
        iClass.x();
        iClass.y();
        iClass.myMethod();
    }

}