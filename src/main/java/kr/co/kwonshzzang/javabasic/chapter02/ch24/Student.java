package kr.co.kwonshzzang.javabasic.chapter02.ch24;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class Student {
    private int studentId;
    private String studentName;
    private List<Subject> takenSubjectList;

    public Student (int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.takenSubjectList = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        takenSubjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for(Subject subject : takenSubjectList) {
            total += subject.getScore();
            System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() + " 과목 성적은 " + subject.getScore() + "입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
    }
}
