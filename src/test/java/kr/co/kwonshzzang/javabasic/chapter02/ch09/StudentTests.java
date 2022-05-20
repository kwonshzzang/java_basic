package kr.co.kwonshzzang.javabasic.chapter02.ch09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTests {
    @Test
    void showStudentScore() {
        Student studentLee = new Student(100, "Lee");
        studentLee.addSubject(new Subject(1001, "국어", 100));
        studentLee.addSubject(new Subject(1002, "수학", 95));

        Student studentKim = new Student(200, "Kim");
        studentKim.addSubject(new Subject(1001, "국어", 80));
        studentKim.addSubject(new Subject(1002, "수학", 99));

        studentLee.showStudentScore();
        studentKim.showStudentScore();
    }
}