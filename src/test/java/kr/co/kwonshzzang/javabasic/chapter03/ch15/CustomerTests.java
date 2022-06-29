package kr.co.kwonshzzang.javabasic.chapter03.ch15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTests {
    @Test
    void start() {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = new Customer();
        buyer.buy();
        buyer.order();

        Sell seller = new Customer();
        seller.sell();
        seller.order();
    }

}