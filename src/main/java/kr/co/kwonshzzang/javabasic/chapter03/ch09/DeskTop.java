package kr.co.kwonshzzang.javabasic.chapter03.ch09;

public class DeskTop extends Computer{
    @Override
    public void display() {
        System.out.println("DeskTop display");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("DeskTop turnOff");
    }
}
