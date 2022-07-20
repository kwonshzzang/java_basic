package kr.co.kwonshzzang.javabasic.chapter05.ch04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayStackTests {
    @Test
    void start() {
        MyArrayStack stack = new MyArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.printAll();

        System.out.println("top element is " + stack.pop());
        System.out.println("top element is " + stack.pop());
        stack.printAll();
        System.out.println("top element is " + stack.peek());
        stack.printAll();
    }

}