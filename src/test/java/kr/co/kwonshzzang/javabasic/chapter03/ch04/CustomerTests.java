package kr.co.kwonshzzang.javabasic.chapter03.ch04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTests {
    @Test
    void createInstance() {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() +  " , 지불금액은 " + price + "원 입니다.");

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() +  " , 지불금액은 " + price + "원 입니다.");

        Customer customerNo = new VIPCustomer(10030, "나몰라");
        customerNo.bonusPoint = 10000;
        price = customerNo.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() +  " , 지불금액은 " + price + "원 입니다.");

    }

}