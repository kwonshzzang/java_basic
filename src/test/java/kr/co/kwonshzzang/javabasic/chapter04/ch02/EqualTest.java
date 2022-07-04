package kr.co.kwonshzzang.javabasic.chapter04.ch02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualTest {
    @Test
    void start() {
        Student studentLee = new Student(100, "Lee");
        Student studentLee2 = studentLee;
        Student studentShun =  new Student(100, "Lee");

        System.out.println(studentLee == studentShun);
        System.out.println(studentLee.equals(studentShun));
        System.out.println(studentLee.hashCode());
        System.out.println(studentShun.hashCode());

        System.out.println(studentLee == studentLee2);

        System.out.println(System.identityHashCode(studentLee));
        System.out.println(System.identityHashCode(studentShun));

        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

    }

    @Test
    void cloneTest() throws CloneNotSupportedException {
        Student studentLee = new Student(100, "Lee");
        studentLee.setName("Kim");
        Student copyStudent = (Student) studentLee.clone();
        System.out.println(copyStudent);
    }

}