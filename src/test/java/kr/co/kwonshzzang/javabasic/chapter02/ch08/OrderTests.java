package kr.co.kwonshzzang.javabasic.chapter02.ch08;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

class OrderTests {
    @Test
    void displyTest() {
        Order order = Order.builder()
                .orderNumber("202011020003")
                .orderPhoneNumber("01023450001")
                .orderAddress("서울시 강남구 역삼동 111-333")
                .orderDate(LocalDate.now())
                .orderTime(LocalTime.now())
                .price(BigDecimal.valueOf(35000))
                .menuNumber("0003")
                .build();

        System.out.println(order);
    }

}