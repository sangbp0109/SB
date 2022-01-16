package com.sb.smoking.smoker.serviceImpl;

import com.sb.smoking.smoker.dao.UserDao;
import com.sb.smoking.smoker.service.UserService;
import com.sb.smoking.smoker.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void userLogin(UserVo userVo) {
        UserVo userVo1 = userDao.userLogin(userVo);
        System.out.println("userVo1 = " + userVo1);
    }
}
