package kr.co.kwonshzzang.javabasic.chapter05.ch03;

public class MyListNode {
    private String data;       //자료
    private MyListNode next;   //다음 노드를 가리키는 링크

    public MyListNode() {
        data = null;
        next = null;
    }

    public MyListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public MyListNode(String data, MyListNode next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public MyListNode getNext() {
        return next;
    }

    public void setNext(MyListNode next) {
        this.next = next;
    }
}
