package com.sb.smoking;

import com.sb.smoking.smoker.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

@SpringBootTest
public class MemberTest {

    @Autowired
    UserDao userDao;

    @Test
    public void test(){
        Map<String,Object> map = userDao.selectTest1();
        System.out.println("map = " + map.get("ID"));
        System.out.println("map = " + map.get("PASSWORD1"));
    }
}
