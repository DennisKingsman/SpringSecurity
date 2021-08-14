package com.spring.security.jdbc.secondsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome";
    }

    @GetMapping("/user")
    public String welcomeUser() {
        return "Welcome user";
    }

    @GetMapping("/admin")
    public String welcomeAdmin() {
        return "Welcome admin";
    }

}
