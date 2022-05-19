package kr.co.kwonshzzang.javabasic.chapter07.school;

import kr.co.kwonshzzang.javabasic.chapter07.utils.Define;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int subjectId;     //과목 고유번호
    private  String subjectName;  //과목 이름
    private int gradeType;     //과목 평가방법 기본은 A, B 방식

    //수강 신청한 학생 리스트
    //register() 메소드를 호출하면 리스트에 추가됨
    private List<Student> studentList = new ArrayList<>();

    public Subject(int subjectId, String subjectName, int gradeType) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = gradeType;
    }

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = Define.AB_TYPE;
    }

    public void register(Student student) {
        studentList.add(student);
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
