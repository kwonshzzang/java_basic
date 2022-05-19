package kr.co.kwonshzzang.javabasic.chapter03.ch03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.setBonusPoint(10000);
        System.out.println(customerKim);
    }
}
