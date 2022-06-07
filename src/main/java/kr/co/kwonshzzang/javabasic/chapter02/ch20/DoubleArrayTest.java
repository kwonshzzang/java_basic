package kr.co.kwonshzzang.javabasic.chapter02.ch20;

public class DoubleArrayTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        double[]  dArr = new double[5];

        dArr[0] = 1.1;
        dArr[1] = 2.1;
        dArr[2] = 3.1;

        double mtotal = 1;
        for(int i = 0; i < dArr.length; i++) {
            mtotal *= dArr[i];
        }
        System.out.println(mtotal);
    }

    public static void test2() {
        double[] dArr = new double[5];
        int count = 0;

        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;
        for(int i = 0; i < count; i++) {
            mtotal *= dArr[i];
        }
        System.out.println(mtotal);
    }
}
