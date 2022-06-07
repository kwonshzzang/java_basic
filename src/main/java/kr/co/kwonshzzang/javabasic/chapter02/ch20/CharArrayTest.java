package kr.co.kwonshzzang.javabasic.chapter02.ch20;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i=0; i< alphabets.length; i++) {
            alphabets[i] = ch++;
        }

        for(char alphabet: alphabets) {
            System.out.println(alphabet + " , " + (int)alphabet);
        }

    }
}
