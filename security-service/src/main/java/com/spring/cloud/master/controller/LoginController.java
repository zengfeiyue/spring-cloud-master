package com.spring.cloud.master.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengfeiyue
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/login")
    public String login() {

        return "login";
    }
    @RequestMapping(value = "/home")
    public String home() {
        System.err.println("123");
        return "home";
    }

}
