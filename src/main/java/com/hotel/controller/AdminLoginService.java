package com.hotel.controller;

import com.hotel.model.Admin;
import com.hotel.repository.AdminLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginService {
    @Autowired
    AdminLoginRepository adminLoginRepository;

    public boolean login(Admin admin) {
        Admin verifiedAdmin = adminLoginRepository.findByNameContaining(admin.getUsername());

        // success
        if(verifiedAdmin != null &&
                verifiedAdmin.getPassword().equals(admin.getPassword())) {
            return true;
        };
        return false;
    }
}
