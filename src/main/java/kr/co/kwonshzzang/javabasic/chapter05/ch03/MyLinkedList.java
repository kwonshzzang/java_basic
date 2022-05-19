package kr.co.kwonshzzang.javabasic.chapter05.ch03;

public class MyLinkedList {
    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode;
        if (head == null) { //맨 처음일때
            newNode = new MyListNode(data);
            head = newNode;
        } else {
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while (temp.getNext() != null) { //맨 뒤로 가서
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(int positon, String data) {
        MyListNode tempNode = head;
        MyListNode newNode = new MyListNode(data);

        if (positon < 0 || positon > count) {
            System.out.println("추가할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if (positon == 0) { //맨 앞에 들어가는 경우
            newNode.setNext(head);
            head = newNode;
        } else {
            MyListNode preNode = null;
            for (int i = 0; i < positon; i++) {
                preNode = tempNode;
                tempNode = tempNode.getNext();
            }
            newNode.setNext(preNode.getNext());
            preNode.setNext(newNode);
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int positoin) {
        MyListNode tempNode = head;

        if (positoin >= count) {
            System.out.println("삭제할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if (positoin == 0) { //맨 앞을 삭제하는 경우
            head = tempNode.getNext();
        } else {
            MyListNode preNode = null;
            for (int i = 0; i < positoin; i++) {
                preNode = tempNode;
                tempNode = tempNode.getNext();
            }
            preNode.setNext(tempNode.getNext());
        }
        count--;
        System.out.println(positoin + "번째 항목을 삭제하였습니다.");
        return tempNode;
    }

    public String getElement(int position) {
        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("검색 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return new String("error");
        }

        if (position == 0) { // 맨 앞인 경우
            return tempNode.getData();
        }

        for (int i = 0; i < position; i++) {
            tempNode = tempNode.getNext();
        }
        return tempNode.getData();
    }

    public void removeAll() {
        head = null;
        count = 0;
    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.getData());
            tempNode = tempNode.getNext();
            if (tempNode != null) {
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }

}
