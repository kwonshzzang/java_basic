package kr.co.kwonshzzang.javabasic.chapter03.ch06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTests {
    @Test
    void createInstance() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(10010,"이순신"));
        customerList.add(new Customer(10020, "신사임당"));
        customerList.add(new GoldCustomer(10030, "홍길동"));
        customerList.add(new GoldCustomer(10040, "이율곡"));
        customerList.add(new VIPCustomer(10050, "김유신", 12345));

        System.out.println("========== 고객 정보 출력 ========== ");
        for(Customer customer: customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("========== 할인율과 보너스 포인트 계산 ========== ");
        int price = 10000;
        for(Customer customer: customerList) {
            System.out.println(customer.getCustomerName() + "님이 " + customer.calcPrice(price) + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }

    }

}