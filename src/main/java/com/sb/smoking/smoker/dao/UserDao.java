package com.sb.smoking.smoker.dao;

import com.sb.smoking.smoker.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserDao {

    Map<String,Object> selectTest1();

    UserVo userLogin (UserVo userVo);

    public void signUp (UserVo userVo);

    /*
    public void userLogin (UserVo userVo);
    */
}
