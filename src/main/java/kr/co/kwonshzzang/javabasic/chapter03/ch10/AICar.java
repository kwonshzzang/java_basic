package kr.co.kwonshzzang.javabasic.chapter03.ch10;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("자동으로 와이퍼를 동작합니다.");
    }

    @Override
    public void washCar() {
        System.out.println("자동 세차를 합니다.");
    }
}
