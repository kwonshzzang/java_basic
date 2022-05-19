package kr.co.kwonshzzang.javabasic.chapter06.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);

        int sumVal = Arrays.stream(arr).sum();
        long count = Arrays.stream(arr).count();

        System.out.println(sumVal);
        System.out.println(count);

        System.out.println();

        Arrays.stream(arr).forEach(n -> System.out.println(n));
        Arrays.stream(arr).forEach(System.out::println);

        IntStream is = Arrays.stream(arr);
        is.sum();
//        is.count();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
        System.out.println(sum2);


    }
}
