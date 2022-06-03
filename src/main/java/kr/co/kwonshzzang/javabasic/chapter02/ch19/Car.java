package kr.co.kwonshzzang.javabasic.chapter02.ch19;

public class Car {
    private static int serialNumber = 10000;

    private int carNum;

    public Car() {
        carNum = ++serialNumber;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public int getCarNum() {
        return carNum;
    }
}
