package com.sb.smoking.smoker.service;

import com.sb.smoking.smoker.vo.UserVo;

public interface UserService {

    //sg
    UserVo userLogin (UserVo userVo);
    //sb
    /*
    public UserVo userLogin(UserVo userVo);
    */

    /*
    void userLogin (UserVo userVo) {
        UserVo userLogin = UserServiceImpl.userLogin(userVo);
        return userLogin;
    }
    */
}
