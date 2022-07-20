package kr.co.kwonshzzang.javabasic.chapter05.ch03;

public class MyLinkedList {
    private MyListNode head;
    private int count;

    public MyLinkedList() {
        this.head = null;
        this.count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode;

        if(head == null)  { // 맨 처음일때
            newNode = new MyListNode(data);
            head = newNode;
        } else {
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while (temp.next != null) { //맨 뒤로 가서
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        int i;
        MyListNode tempNode = head;
        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count) {
            System.out.println("추가할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if(position == 0) { //맨 앞에 들어가는 경우
            newNode.next = head;
            head = newNode;
        } else {
            MyListNode preNode = null;
            for(i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position) {
        int i;
        MyListNode tempNode = head;

        if(position >= count) {
            System.out.println("삭제할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if(position == 0) { //맨 앞을 삭제하는 경우
            head = tempNode.next;
        } else {
            MyListNode preNode = null;
            for(i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "번째 항목이 삭제되었습니다. ");
        return tempNode;
    }

    public String getElement(int position) {
        int i;
        MyListNode tempNode = head;

        if(position >= count) {
            System.out.println("검색위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if(position == 0) {
            return tempNode.getData();
        }

        for(i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }
        return tempNode.getData();
    }

    public MyListNode getNode(int position) {
        int i;
        MyListNode tempNode = head;

        if(position >= count) {
            System.out.println("검색위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if(position == 0) {
            return tempNode;
        }

        for(i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    public void removeAll() {
        head = null;
        count = 0;
    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if(count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.getData());
            tempNode = tempNode.next;
            if(tempNode != null)
                System.out.print("->");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        if(head == null) return true;
        return false;
    }


}
