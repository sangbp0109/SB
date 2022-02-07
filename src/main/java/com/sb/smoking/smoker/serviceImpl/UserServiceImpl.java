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
            }
            */
        if (userLogin == null) {
            return null;
        }
        return userDao.userLogin(userVo);
    }

    /*
    public boolean login (String userId, String userPw) {
        // TODO Auto-generated method stub
        UserVo user = userDao.userLogin(userId);
        if (user != null) {
            if (user.getUserPw().equals(userPw)) {
                return true;
            }
        }
        return false;
    }
    */


    @Override
    public void signUp(UserVo userVo) {

    }
}