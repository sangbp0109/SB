package com.sb.smoking.smoker.service;

import com.sb.smoking.smoker.vo.UserVo;

public interface UserService {

    //sg
    public UserVo userLogin (UserVo userVo);
    //sb
    /*
    public UserVo userLogin(UserVo userVo);
    */
    public void signUp (UserVo userVo);
    /*
    void userLogin (UserVo userVo) {
        UserVo userLogin = UserServiceImpl.userLogin(userVo);
        return userLogin;
    }
    */
}
