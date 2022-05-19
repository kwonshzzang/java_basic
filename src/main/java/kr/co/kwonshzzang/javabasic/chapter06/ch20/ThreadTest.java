package kr.co.kwonshzzang.javabasic.chapter06.ch20;

class MyThread extends Thread {
    public void run() {
        for(int i = 0; i < 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + " start");
        MyThread th1 = new MyThread();
        th1.start();

        MyThread th2 = new MyThread();
        th2.start();

        System.out.println(Thread.currentThread() + " end");
    }
}
