package kr.co.kwonshzzang.javabasic.chapter02.ch10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayTests {
    @Test
    void test() {
        Birthday date = new Birthday();
        date.setYear(2022);
        date.setMonth(12);
        date.setDay(30);

        date.showDate();
    }

}