package kr.co.kwonshzzang.javabasic.chapter02.ch24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTests {
    @Test
    void createTest() {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject(Subject.builder().subjectName("국어").score(100).build());
        studentLee.addSubject(Subject.builder().subjectName("수학").score(50).build());

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject(Subject.builder().subjectName("국어").score(70).build());
        studentKim.addSubject(Subject.builder().subjectName("수학").score(85).build());
        studentKim.addSubject(Subject.builder().subjectName("영어").score(100).build());

        studentLee.showStudentInfo();
        System.out.println("=========================================================");
        studentKim.showStudentInfo();
    }

}