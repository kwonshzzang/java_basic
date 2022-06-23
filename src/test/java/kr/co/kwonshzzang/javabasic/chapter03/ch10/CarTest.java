package kr.co.kwonshzzang.javabasic.chapter03.ch10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void createInstance() {
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("=================");
        Car manualCar = new ManualCar();
        manualCar.run();
    }

}