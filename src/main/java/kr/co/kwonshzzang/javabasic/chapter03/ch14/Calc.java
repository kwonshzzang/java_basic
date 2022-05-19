package kr.co.kwonshzzang.javabasic.chapter03.ch14;

public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);

    int subtract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }

    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }

        mystaticMethod();
        return total;
    }

    private void myMethod() {
        System.out.println("private method");
    }

    private static void mystaticMethod() {
        System.out.println("private static method");
    }
}
