package kr.co.kwonshzzang.javabasic.chapter06.ch19;

public class Latte extends Decorator {

    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding Milk ");
    }
}
