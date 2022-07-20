package kr.co.kwonshzzang.javabasic.chapter05.ch03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTests {
    @Test
    void start() {
        MyLinkedList list = new MyLinkedList();

        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.printAll();

        list.insertElement(3, "D");
        list.printAll();

        list.removeElement(0);
        list.printAll();
        list.removeElement(1);
        list.printAll();

        list.insertElement(0, "A-1");
        list.printAll();
        System.out.println(list.getSize());

        list.removeElement(0);
        list.printAll();
        System.out.println(list.getSize());

        list.removeAll();
        list.printAll();

        list.addElement("A");
        list.printAll();

        System.out.println(list.getElement(0));
        list.removeElement(0);
    }

}