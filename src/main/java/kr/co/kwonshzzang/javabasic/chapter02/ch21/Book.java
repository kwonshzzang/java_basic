package kr.co.kwonshzzang.javabasic.chapter02.ch21;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private String title;
    private String author;

    public void showBookInfo() {
        System.out.println(title + " , " + author);
    }
}
