package kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserInfo {
    private String id;
    private String password;
    private String name;
}
