package kr.co.kwonshzzang.javabasic.chapter02.ch14;

public class Taxi {
    private String name;
    private int money;

    public Taxi(String name) {
        this.name = name;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showInfo() {
        System.out.println(name + " 택시 수입은 " + money + "원 입니다.");
    }
}
