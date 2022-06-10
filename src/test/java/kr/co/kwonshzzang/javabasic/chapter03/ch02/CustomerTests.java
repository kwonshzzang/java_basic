package kr.co.kwonshzzang.javabasic.chapter03.ch02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTests {
    @Test
    void createInstance() {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(10020);
        customerKim.bonusPoint=10000;
        System.out.println(customerKim.showCustomerInfo());
    }

}