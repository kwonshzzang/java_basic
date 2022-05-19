package kr.co.kwonshzzang.javabasic.chapter03.ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(10010);
        customerLee.setBonusPoint(1000);
        System.out.println(customerLee);

        Customer customerKim = new VIPCustomer();
        customerKim.setCustomerId(10020);
        customerKim.setCustomerName("김유신");
        customerKim.setBonusPoint(10000);
        System.out.println(customerKim);
    }
}
