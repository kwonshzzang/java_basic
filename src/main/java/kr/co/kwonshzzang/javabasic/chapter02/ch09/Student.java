package kr.co.kwonshzzang.javabasic.chapter02.ch09;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int studentId;
    String studentName;
    List<Subject> takenSubjects;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.takenSubjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        this.takenSubjects.add(subject);
    }

    public void showStudentScore() {
        int total = 0;
        for(Subject s: this.takenSubjects) {
            total += s.getScore();
        }
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
    }
}
