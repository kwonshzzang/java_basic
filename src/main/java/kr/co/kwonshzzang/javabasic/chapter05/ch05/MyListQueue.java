package kr.co.kwonshzzang.javabasic.chapter05.ch05;

import kr.co.kwonshzzang.javabasic.chapter05.ch03.MyLinkedList;
import kr.co.kwonshzzang.javabasic.chapter05.ch03.MyListNode;

interface IQueue {
    void enQueue(String data);
    String deQueue();
    void printAll();
}

public class MyListQueue extends MyLinkedList implements IQueue  {
    MyListNode front;
    MyListNode rear;

    public MyListQueue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if(isEmpty()) { // 처음 항목
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        } else {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " added");
    }

    @Override
    public String deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        String data = front.getData();
        front = front.next;

        if(front == null) { //마지막 항목
            rear = null;
        }
        return data;
    }

    @Override
    public void printAll() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        MyListNode tempNode = front;
        while (tempNode != null) {
            System.out.print(tempNode.getData());
            tempNode =tempNode.next;
            if(tempNode != null)
                System.out.print("->");
        }
        System.out.println();
    }
}
