package kr.co.kwonshzzang.javabasic.chapter04.ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));
        buffer.append(android);

        System.out.println(System.identityHashCode(buffer));

        System.out.println(buffer.toString());
    }
}
