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
    AdminLoginRepository adminLoginRepository;

    @RequestMapping(value="/admin/login", method = RequestMethod.GET)
    public String loginForm(){
        return "adminPage/admin_login";
    }

    @PostMapping("/admin/perform_login")
    public String login(Admin admin) {
        Admin verifiedAdmin = adminLoginRepository.findByNameContaining(admin.getUsername());

        // success
        if(verifiedAdmin != null &&
                verifiedAdmin.getPassword().equals(admin.getPassword())) {
            return "adminPage/reserve_page";
        };
        return "redirect:/admin/login";
    }
}
