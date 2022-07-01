package kr.co.kwonshzzang.javabasic.chapter03.ch16.scheduler;

public interface Scheduler {
    void getNextCall();
    void sendCallToAgent();
}
