package kr.co.kwonshzzang.javabasic.chapter02.ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentId = 12345;
        studentLee.setStudentName("이순신");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 12346;
        studentKim.studentName = "김유신";
        studentKim.address = "경상북도 경주";

        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
