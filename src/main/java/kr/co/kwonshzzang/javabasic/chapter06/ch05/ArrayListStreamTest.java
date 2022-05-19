package kr.co.kwonshzzang.javabasic.chapter06.ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
//        stream.forEach(s -> System.out.println(s));
        stream.forEach(System.out::println);
        System.out.println();

        sList.stream().sorted().forEach(System.out::println);
//        sList.stream().map(s -> s.length()).forEach(System.out::println);
        sList.stream().map(String::length).forEach(System.out::println);
        System.out.println();
        sList.stream().filter(s -> s.length() >= 5).forEach(System.out::println);
        System.out.println();

    }

}
