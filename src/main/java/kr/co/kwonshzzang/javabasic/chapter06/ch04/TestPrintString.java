package kr.co.kwonshzzang.javabasic.chapter06.ch04;

public class TestPrintString {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);  //람다식을 변수에 대입
        lambdaStr.showString("hello lambda_1");

        showString(lambdaStr);

        PrintString reStr = returnString();
        reStr.showString("hello ");
    }

    public static void showString(PrintString p) {
        p.showString("hello lambda_2");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + "world");
    }
}
