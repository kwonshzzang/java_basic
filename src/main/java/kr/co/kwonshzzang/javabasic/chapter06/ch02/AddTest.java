package kr.co.kwonshzzang.javabasic.chapter06.ch02;

public class AddTest {
    public static void main(String[] args) {
//        Add addL  = (x, y) -> {return x + y;};
        Add addL = (x, y) -> x + y;

        System.out.println(addL.add(2, 3));
    }
}
