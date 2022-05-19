package kr.co.kwonshzzang.javabasic.chapter03.ch16.gameLevel;

public class UltraSuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("초고속으로 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("2회전 jump를 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 울트라 슈퍼 레벨입니다. ******");
    }
}
