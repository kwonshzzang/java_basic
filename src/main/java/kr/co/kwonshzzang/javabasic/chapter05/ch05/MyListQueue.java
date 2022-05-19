package kr.co.kwonshzzang.javabasic.chapter05.ch05;

import kr.co.kwonshzzang.javabasic.chapter05.ch03.MyLinkedList;
import kr.co.kwonshzzang.javabasic.chapter05.ch03.MyListNode;

interface IQueue {
    public void enQueue(String data);

    public String deQueue();

    public void printQueue();
}


public class MyListQueue extends MyLinkedList implements IQueue {
    MyListNode front;
    MyListNode rear;

    public MyListQueue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if (isEmpty()) { //처음 항목
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
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        String data = front.getData();
        front = front.getNext();
        removeElement(0);
        if (front == null) { //마지막 항목
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue() {
        printAll();
    }
}
