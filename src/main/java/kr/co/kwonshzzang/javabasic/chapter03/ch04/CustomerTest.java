package kr.co.kwonshzzang.javabasic.chapter03.ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.setBonusPoint(1000);
        System.out.println(customerLee);

        Customer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.setBonusPoint(10000);
        System.out.println(customerKim);

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee + " 지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim + " 지불금액은 " + priceKim + "원 입니다.");

        Customer customerNo = new VIPCustomer(10030, "나몰라");
        customerNo.setBonusPoint(10000);
        int priceNo = customerNo.calcPrice(10000);
        System.out.println(customerNo + " 지불금액은 " + priceNo + "원 입니다.");
    }
}
