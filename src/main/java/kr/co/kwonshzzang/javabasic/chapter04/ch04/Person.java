package kr.co.kwonshzzang.javabasic.chapter04.ch04;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Person {
    @NonNull
    private String name;
    private int age;
}
