package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;


import java.util.Objects;

@Controller
public class LoginController {

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        String password = requestUser.getPassword();
        password = HtmlUtils.htmlEscape(password);

        if (!username.equals("admin") || !password.equals("123456")) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400, 0);
        } else {
            return new Result(200, 0);
        }
    }
}
