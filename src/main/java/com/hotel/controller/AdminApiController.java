package com.hotel.controller;

import com.hotel.model.AdminUser;
import com.hotel.model.RoomBookingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminApiController {

    @Autowired
    ManageReserveService manageReserveService;

    @RequestMapping(value = "/admin/getUserData", method= RequestMethod.GET)
    public ResponseEntity<List<RoomBookingDetails>> getUserData() {
        List<RoomBookingDetails> data = manageReserveService.getUserData();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @RequestMapping(value="/admin/reserveCheck", method= RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminUser reserveCheck(@RequestBody AdminUser user) {
        System.out.println(user.getId());
        System.out.println(user.getReserveCheck());
        manageReserveService.reserveCheck(user);

        return user;
    }
}
