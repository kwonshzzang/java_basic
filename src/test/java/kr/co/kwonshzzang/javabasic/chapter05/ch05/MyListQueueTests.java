package kr.co.kwonshzzang.javabasic.chapter05.ch05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListQueueTests {
    @Test
    void start() {
        MyListQueue listQueue = new MyListQueue();
        listQueue.enQueue("A");
        listQueue.enQueue("B");
        listQueue.enQueue("C");
        listQueue.enQueue("D");
        listQueue.enQueue("E");

        listQueue.printAll();

        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        listQueue.printAll();

        listQueue.enQueue("F");
        listQueue.printAll();
    }

}