package kr.co.kwonshzzang.javabasic.chapter06.ch07;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TravelCustomer {
    private String name;  //이름
    private int age;      //나이
    private int price;    //가격

    @Override
    public String toString() {
        return "name : " + name + ", age : " + age + ", price : " + price;
    }
}
