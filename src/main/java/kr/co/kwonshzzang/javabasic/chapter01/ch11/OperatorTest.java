package kr.co.kwonshzzang.javabasic.chapter01.ch11;

public class OperatorTest {
    public static void main(String[] args) {
        int gameScore1 = 150;
        int lastScore1 = ++gameScore1;  //gameScore1 += 1;  gameScore1 = gameScore1 + 1;

        System.out.println(lastScore1);
        System.out.println(gameScore1);

        int gameScore2 = 150;
        int lastScore2 = gameScore2++;

        System.out.println(lastScore2);
        System.out.println(gameScore2);
    }
}
