package kr.co.kwonshzzang.javabasic.chapter05.ch02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTests {
    @Test
    void start() {
        MyArray array = new MyArray();
        array.addElement(10);
        array.addElement(20);
        array.addElement(30);
        array.printAll();
        System.out.println("===============");

        array.insertElement(1, 50);
        array.printAll();
        System.out.println("===============");

        array.removeElement(1);
        array.printAll();
        System.out.println("===============");

        array.addElement(70);
        array.printAll();
        System.out.println("===============");

        array.removeElement(1);
        array.printAll();
        System.out.println("===============");

        System.out.println(array.getElement(2));
    }

}