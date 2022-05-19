package kr.co.kwonshzzang.javabasic.chapter06.ch19;

public class Mocha extends Decorator {
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding Mocha Syrup ");
    }
}
