package kr.co.kwonshzzang.javabasic.chapter06.ch16;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {
    public static void main(String[] args) {
        long millisecond = 0;

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
            millisecond = System.currentTimeMillis();
            int i;
            while( (i = bis.read()) != -1) {
                bos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일을 복사하는데 " + millisecond + " millisecends 소요되었습니다.");

        Socket socket = new Socket();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            br.read();
            br.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
