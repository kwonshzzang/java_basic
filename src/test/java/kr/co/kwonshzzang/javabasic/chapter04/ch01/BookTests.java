package kr.co.kwonshzzang.javabasic.chapter04.ch01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTests {
    @Test
    void start() {
        Book book = new Book("데미안", "헤르만 헤세");
        System.out.println(book);

        String str = new String("Test");
        System.out.println(str);
    }

}