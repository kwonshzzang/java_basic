package kr.co.kwonshzzang.javabasic.chapter06.ch19;

public class WhippedCream extends  Decorator {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding WhippedCream ");
    }
}
