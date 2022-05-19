package kr.co.kwonshzzang.javabasic.chapter05.ch12;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add(new String("김유신"));
        hashSet.add(new String("이순신"));
        hashSet.add(new String("홍연의"));
        hashSet.add(new String("강감찬"));
        hashSet.add(new String("강감찬"));

        System.out.println(hashSet);
    }
}
