package com.hotel.controller;

import com.hotel.model.Admin;
import com.hotel.repository.AdminLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminLoginController {

    @Autowired
    AdminLoginService loginService;

    @RequestMapping(value="/admin/login", method = RequestMethod.GET)
    public String loginForm(){
        return "adminPage/admin_login";
    }

    @PostMapping("/admin/perform_login")
    public String login(Admin admin) {
        return loginService.login(admin)?
                "adminPage/reserve_page":"redirect:/admin/login";

    }
}
