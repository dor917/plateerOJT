package com.hotel.controller;

import com.hotel.model.RoomBookingDetails;
import com.hotel.model.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    ManageReserveService manageReserveService;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String adminPage() {
        return "adminPage/reserve_page";
    }


}
