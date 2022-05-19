package kr.co.kwonshzzang.javabasic.chapter03.ch09;

public abstract class Computer {
    public abstract void display();

    public abstract void typing();

    public void turn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
