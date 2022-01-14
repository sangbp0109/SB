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

<<<<<<< HEAD
    @RequestMapping("loginPage.do")
    public String loginPage() {
        System.out.println("loginPage로 이동");
        return "login/loginPage";

    }

        System.out.println("loginPage로 이동");
=======
>>>>>>> parent of 0fe117b (22/01/14 17:00)
    @RequestMapping("signUpPage.do")
    public String signUpPage() {
        System.out.println("signUpPage로 이동");
        return "signUp/signUpPage";

    }
}
