package com.sb.smoking.smoker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

    @RequestMapping("/")
    public String index() {
        System.out.println("index 실행");
        return "index";

    }

    @RequestMapping("loginPage.do")
    public String loginPage() {
        System.out.println("loginPage로 이동");
        return "login/loginPage";

    }

        System.out.println("loginPage로 이동");
    @RequestMapping("signUpPage.do")
    public String signUpPage() {
        System.out.println("signUpPage로 이동");
        return "user/signUpPage";

    }
}
