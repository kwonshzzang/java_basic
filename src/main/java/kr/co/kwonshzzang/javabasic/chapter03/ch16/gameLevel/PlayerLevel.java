package kr.co.kwonshzzang.javabasic.chapter03.ch16.gameLevel;

public abstract class PlayerLevel {
    public abstract void run();

    public abstract void jump();

    public abstract void turn();

    public abstract void showLevelMessage();

    public final void go(int jumpCount) {
        run();
        for (int i = 0; i < jumpCount; i++) {
            jump();
        }
        turn();
    }
}
