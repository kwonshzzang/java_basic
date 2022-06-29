package kr.co.kwonshzzang.javabasic.chapter03.ch15;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("sell order");
    }
}
