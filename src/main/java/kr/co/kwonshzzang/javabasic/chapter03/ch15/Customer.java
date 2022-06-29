package kr.co.kwonshzzang.javabasic.chapter03.ch15;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }

    public void hello() {
        System.out.println("hello");
    }

}
