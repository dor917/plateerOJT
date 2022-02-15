package com.hotel.controller;

import com.hotel.model.RoomBookingDetails;
import com.hotel.model.AdminUser;
import com.hotel.repository.AdminManageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManageReserveService {


    @Autowired
    AdminManageRepository adminManageRepository;

    public List<RoomBookingDetails> getUserData() {
        List<RoomBookingDetails> members = (List<RoomBookingDetails>)adminManageRepository.findAll();
        return members;
    }

    @Transactional
    public void reserveCheck(AdminUser user) {
        adminManageRepository.reserveUpdate(user.getId(), user.getReserveCheck());
    }

}
