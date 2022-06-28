package kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao.oracle;

import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.UserInfo;
import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into ORACLE DB id = " + userInfo.getId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into ORACLE DB id = " + userInfo.getId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from ORACLE DB id = " + userInfo.getId());
    }
}
