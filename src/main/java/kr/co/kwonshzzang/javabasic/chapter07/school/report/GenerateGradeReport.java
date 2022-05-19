package kr.co.kwonshzzang.javabasic.chapter07.school.report;

import kr.co.kwonshzzang.javabasic.chapter07.grade.BasicEvaluation;
import kr.co.kwonshzzang.javabasic.chapter07.grade.GradeEvaluation;
import kr.co.kwonshzzang.javabasic.chapter07.grade.MajorGrade;
import kr.co.kwonshzzang.javabasic.chapter07.grade.PassFailEvaluation;
import kr.co.kwonshzzang.javabasic.chapter07.school.School;
import kr.co.kwonshzzang.javabasic.chapter07.school.Score;
import kr.co.kwonshzzang.javabasic.chapter07.school.Student;
import kr.co.kwonshzzang.javabasic.chapter07.school.Subject;
import kr.co.kwonshzzang.javabasic.chapter07.utils.Define;
import java.util.List;

public class GenerateGradeReport {

    School  school = School.getInstance();
    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER = "이름  |  학번  |  중점과목  |  점수  \n";
    public static final String LINE = "--------------------------------\n";
    private StringBuffer buffer = new StringBuffer();

    public String getReport() {
        List<Subject> subjectList = school.getSubjectList();
        for(Subject subject: subjectList) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString();
    }

    private void makeHeader(Subject subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.LINE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }

    private void makeBody(Subject subject) {
        List<Student> studentList = subject.getStudentList();  // 각 과목의 학생들
        for(Student student: studentList) {
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName());
            buffer.append(" | ");

            getScoreGrade(student, subject);
            buffer.append("\n");
            buffer.append(LINE);
        }
    }

    private void getScoreGrade(Student student, Subject subject) {
        List<Score> scoreList =student.getScoreList();
        int majorId = student.getMajorSubject().getSubjectId();

        GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorGrade(), new PassFailEvaluation()};  //학점 평가 룰

        for(Score score: scoreList) {
            if(score.getSubject().getSubjectId() == subject.getSubjectId()) {  //현재 학정을 산출할 과목
                String grade;

                if(score.getSubject().getGradeType() == Define.PF_TYPE) {
                    grade = gradeEvaluations[Define.PF_TYPE].getGrade(score.getPoint());
                } else {
                    if(score.getSubject().getSubjectId() == majorId) { //중점 과목인 경우
                        grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
                    } else {
                        grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());
                    }
                }
                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }
    }

    public void makeFooter() {
        buffer.append("\n");
    }


}
