package kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.web;

import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.UserInfo;
import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao.UserInfoDao;
import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import kr.co.kwonshzzang.javabasic.chapter03.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        System.out.println(dbType);

        UserInfo userInfo = UserInfo.builder()
                .id("12345")
                .password("!@#$%")
                .name("이순신")
                .build();

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("db support error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
