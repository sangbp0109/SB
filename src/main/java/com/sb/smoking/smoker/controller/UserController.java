package com.sb.smoking.smoker.controller;

import com.sb.smoking.smoker.service.UserService;
import com.sb.smoking.smoker.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
//@ComponentScan(basePackages = {"com.sb.smoking.smoker.controller"})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        System.out.println("index 실행");
        return "index";
    }

    @RequestMapping("/loginPage.do")
    public String loginPage() {
        System.out.println("loginPage 로 이동");
        return "login/loginPage";
    }


    //sg
    @RequestMapping(value = "/userLogin.do", method=RequestMethod.POST)
    public String login(@ModelAttribute UserVo userVo) {
        userService.userLogin(userVo);
        System.out.println("indexPage 로 이동");
        return "index";
    }


    /*
    //sb
    @RequestMapping(value = "/userLogin.do", method=RequestMethod.POST)
    @ResponseBody
    public UserVo userLogin(@RequestBody UserVo userVo, HttpSession session, HttpServletResponse response) {
        UserVo userLogin = userService.userLogin(userVo);
        return userLogin;
    }
    */



    /*회원가입 페이지로 이동*/
    @RequestMapping("/signUpPage.do")
    public String signUpPage() {
        System.out.println("signUpPage 로 이동");
        return "signUp/signUpPage";
    }

    /*회원가입 완료*/
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String signUp(@ModelAttribute UserVo userVo) {
        userService.signUp(userVo);
        System.out.println("회원가입 완료");
        return "login/success";
//        retrun "redirect:login";
    }

    @RequestMapping("/findIdPage.do")
    public String findIdPage() {
        System.out.println("findIdPage 로 이동");
        return "find/findIdPage";
    }

    @RequestMapping("/findPasswordPage.do")
    public String findPasswordPage() {
        System.out.println("findPasswordPage 로 이동");
        return "find/findPasswordPage";
    }

}
