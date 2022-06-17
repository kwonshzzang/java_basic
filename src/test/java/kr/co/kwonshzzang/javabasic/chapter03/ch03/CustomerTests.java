package kr.co.kwonshzzang.javabasic.chapter03.ch03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTests {
    @Test
    void createInstance() {
        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");

        Customer vc = new VIPCustomer(12345, "noname");

    }

}