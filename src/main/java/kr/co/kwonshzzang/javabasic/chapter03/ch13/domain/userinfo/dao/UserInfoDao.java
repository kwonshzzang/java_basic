package kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao;

import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void deleteUserInfo(UserInfo userInfo);
}
