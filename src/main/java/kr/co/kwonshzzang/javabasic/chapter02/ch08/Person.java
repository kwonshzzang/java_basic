package kr.co.kwonshzzang.javabasic.chapter02.ch08;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    @Override
    public String toString() {
       String message =  "키가 " + height + " 이고 몸무게가 " + weight + " 킬로인 남성이 있습니다. \n" +
                         "이름은 " + name + " 이고 나이는 " + age + "세 입니다.";
       return message;
    }
}
