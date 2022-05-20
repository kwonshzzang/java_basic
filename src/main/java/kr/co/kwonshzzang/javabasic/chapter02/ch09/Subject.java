package kr.co.kwonshzzang.javabasic.chapter02.ch09;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Subject {
    int subjectId;
    String subjectName;
    int score;
}
