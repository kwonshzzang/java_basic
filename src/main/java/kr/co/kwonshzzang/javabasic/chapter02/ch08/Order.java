package kr.co.kwonshzzang.javabasic.chapter02.ch08;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order {
    private String orderNumber;
    private String orderPhoneNumber;
    private String orderAddress;
    private LocalDate orderDate;
    private LocalTime orderTime;
    private BigDecimal price;
    private String menuNumber;

    @Override
    public String toString() {
      return  "주문 접수번호 : " + orderNumber + "\n" +
               "주문 핸드폰번호 : " + orderPhoneNumber + "\n" +
               "주문 집주소 : " + orderAddress + "\n" +
               "주문 날짜 : " +  orderDate + "\n" +
               "주문 시간 : " + orderTime + "\n" +
               "주문 가격 : " + price + "\n" +
               "메뉴 번호 : " + menuNumber;
    }
}
