package kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao.mysql;

import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.UserInfo;
import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYQL DB userId =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId =" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from MYSQL DB userId =" + userInfo.getUserId());
    }
}
