package kr.co.kwonshzzang.javabasic.chapter02.ch11;

public class TestReport {
    public static void main(String[] args) {
        MakeReport builder = new MakeReport();
        String report = builder.getReport();

        System.out.println(report);
    }
}
