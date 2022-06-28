package kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao.mysql;

import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.UserInfo;
import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB id = " + userInfo.getId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB id = " + userInfo.getId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from MYSQL DB id = " + userInfo.getId());
    }
}
