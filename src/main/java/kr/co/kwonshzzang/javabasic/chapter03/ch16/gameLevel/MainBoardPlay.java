package kr.co.kwonshzzang.javabasic.chapter03.ch16.gameLevel;

public class MainBoardPlay {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        player.upgradeLevel(new AdvancedLevel());
        player.play(2);

        player.upgradeLevel(new SuperLevel());
        player.play(3);

        player.upgradeLevel(new UltraSuperLevel());
        player.play(2);
    }
}
