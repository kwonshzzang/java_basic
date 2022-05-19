package kr.co.kwonshzzang.javabasic.chapter02.ch08;

public class PersonTest {
    public static void main(String[] args) {
        Person person = Person.builder()
                .age(37)
                .height(178)
                .weight(78)
                .name("Tomas")
                .build();

        System.out.println(person);
    }
}
