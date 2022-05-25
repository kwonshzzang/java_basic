package kr.co.kwonshzzang.javabasic.chapter02.ch14;

public class Subway {
    private int number;
    private int passengerCount;
    private int money;

    public Subway(int number) {
        this.number = number;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showInfo() {
        System.out.println(number + "번 지하철의 승객수는 " + passengerCount + "이고, 수입은 " + money + "원 입니다.");
    }
}
