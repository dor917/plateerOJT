package com.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminLoginController {
    @RequestMapping(value="/admin/login", method = RequestMethod.GET)
    public String index2() {
        return "adminPage/admin_login";
    }

    @PostMapping("/admin/perform_login")
    public String login() {
        return "";
    }
}
