package kr.co.kwonshzzang.javabasic.chapter03.ch11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @Test
    void start() {
        Calc calc = new CompleteCalc();
        int num1 = 10;
        int num2 = 2;

        System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2));
        System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));

    }
}