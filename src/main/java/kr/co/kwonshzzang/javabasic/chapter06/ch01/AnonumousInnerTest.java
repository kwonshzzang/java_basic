package kr.co.kwonshzzang.javabasic.chapter06.ch01;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 10;

        return new Runnable() {
            int localNum = 10;

            @Override
            public void run() {
//                num = 200;  //에러남. 지역변수는 상수로 바뀜, final로 처리
//                i = 100;    //에러남. 매개변수 역시 지역변수처럼 상수로 바뀜, final로 처리
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("OutClass.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        };
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}


public class AnonumousInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(10);
        runner.run();

        out.runnable.run();
    }
}
