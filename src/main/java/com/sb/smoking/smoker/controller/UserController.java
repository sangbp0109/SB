package com.sb.smoking.smoker.controller;

import com.sb.smoking.smoker.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping("/")
    public String index() {
        System.out.println("index 실행");
        return "index";
    }

    @RequestMapping("loginPage.do")
    public String loginPage() {
        System.out.println("loginPage 로 이동");
        return "login/loginPage";
    }

    @RequestMapping(value = "userLogin.do", method=RequestMethod.POST)
    public String login() {
        UserService.userLogin();
        System.out.println("indexPage 로 이동");
        return "index";
    }

    @RequestMapping("signUpPage.do")
    public String signUpPage() {
        System.out.println("signUpPage 로 이동");
        return "signUp/signUpPage";
    }

    @RequestMapping("findIdPage.do")
    public String findIdPage() {
        System.out.println("findIdPage 로 이동");
        return "find/findIdPage";
    }

    @RequestMapping("findPasswordPage.do")
    public String findPasswordPage() {
        System.out.println("findPasswordPage 로 이동");
        return "find/findPasswordPage";
    }

}
