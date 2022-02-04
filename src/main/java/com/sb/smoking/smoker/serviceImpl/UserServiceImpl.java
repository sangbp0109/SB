package com.sb.smoking.smoker.serviceImpl;

import com.sb.smoking.smoker.dao.UserDao;
import com.sb.smoking.smoker.service.UserService;
import com.sb.smoking.smoker.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    public UserVo userLogin(UserVo userVo) {
        String id = userVo.getId();
        String pw = userVo.getPassword1();

        UserVo userLogin = userDao.userLogin(userVo);
            /*
            if (id.isEmpty() && pw.isEmpty()) {
                System.out.println("id = " + id);
                System.out.println("pw = " + pw);
            }*/
        if(userLogin != null) {
            if(userVo.getId().equals("id")) {

            }
        }
        return userLogin;
    }

    @Override
    public void signUp(UserVo userVo) {




    }
}


