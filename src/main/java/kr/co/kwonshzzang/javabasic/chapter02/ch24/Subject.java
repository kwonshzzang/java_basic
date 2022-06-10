package kr.co.kwonshzzang.javabasic.chapter02.ch24;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Subject {
    private String subjectName;
    private int score;
}
