package kr.co.kwonshzzang.javabasic.chapter02.ch18;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTests {
    @Test
    void usingClass() {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();

    }

}