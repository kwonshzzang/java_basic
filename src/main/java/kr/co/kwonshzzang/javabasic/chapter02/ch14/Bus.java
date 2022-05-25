package kr.co.kwonshzzang.javabasic.chapter02.ch14;

public class Bus {
    private int number;
    private int passengerCount;
    private int money;

    public Bus(int number) {
        this.number = number;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showInfo() {
        System.out.println(number + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
 }
