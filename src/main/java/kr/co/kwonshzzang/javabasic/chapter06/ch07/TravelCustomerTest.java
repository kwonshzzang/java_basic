package kr.co.kwonshzzang.javabasic.chapter06.ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("== 고객 명단 추가된 순서대로 출력");
//        customerList.stream().map(c -> c.getName()).forEach(System.out::println);
        customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);

        int total = customerList.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println("총 여행 비용은 : " + total + "만원입니다. ");

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream().filter(c -> c.getAge() >= 20).map(TravelCustomer::getName).sorted().forEach(System.out::println);


    }
}
