package kr.co.kwonshzzang.javabasic.chapter06.ch01;

class OutClass2 {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 10;

        class MyRunnable implements Runnable {
            int localNum = 10;

            @Override
            public void run() {
//                num = 200;  //에러남. 지역변수는 상수로 바뀜
//                i = 100;    //에러남. 매개변수 역시 지역변수처럼 상수로 바뀜
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("OutClass.sNum = " + OutClass2.sNum + "(외부 클래스 정적 변수");
            }
        }
        return new MyRunnable();
    }

}

public class LocalInnerTest {
    public static void main(String[] args) {
        OutClass2 out = new OutClass2();
        Runnable runner = out.getRunnable(10);
        runner.run();
    }
}
