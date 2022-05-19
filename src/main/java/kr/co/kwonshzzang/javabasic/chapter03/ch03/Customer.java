package kr.co.kwonshzzang.javabasic.chapter03.ch03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

//    public Customer() {
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//        System.out.println("Customer() 생성자 호출!");
//    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer(int, String) 생성자 호출!");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    @Override
    public String toString() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
