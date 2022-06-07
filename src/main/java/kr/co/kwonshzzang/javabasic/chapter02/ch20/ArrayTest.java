package kr.co.kwonshzzang.javabasic.chapter02.ch20;

public class ArrayTest {
    public static void main(String[] args) {
        int[]  arr = new int[10];
        int total = 0;

        for(int i=0, num = 1; i < arr.length; i++, num++) {
            arr[i] = num;
        }

        for(int i= 0; i < arr.length; i++) {
            total += arr[i];
        }

        total = 0;
        for(int num : arr) {
            total += num;
        }

        System.out.println(total);
    }
}
