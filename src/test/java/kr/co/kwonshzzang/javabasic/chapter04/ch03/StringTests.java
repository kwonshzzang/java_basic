package kr.co.kwonshzzang.javabasic.chapter04.ch03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTests {

    @Test
    void test1() {
        //In Heap
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);

        //In Constant pool
        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);
    }

    @Test
    void test2() {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }

    @Test
    void stringbuilderTest() {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(android);
        System.out.println(System.identityHashCode(buffer));

        System.out.println(buffer.toString());
    }

    @Test
    void textblockTest() {
        String strBlock = """
                This
                is
                text
                block
                test.
                """;

        System.out.println(strBlock);
        System.out.println(getBlockOfHtml());
    }

    private String getBlockOfHtml() {
        return """
                <html>
                    <body>
                        <span>example text</span>
                    </body>
                </html>
      
                """;
    }
}
