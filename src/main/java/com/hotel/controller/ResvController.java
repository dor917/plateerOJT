package com.hotel.controller;

import com.hotel.model.Rooms;
import com.hotel.repository.ResvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/resv/**")
public class ResvController {

    @Autowired
    private ResvRepository resvRepository;

    @GetMapping("search")
    public ModelAndView search() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("entity/search");
        return mav;
    }

    @PostMapping("search")
    public ModelAndView search(String check_in_date, String check_out_date) {
        ModelAndView mav = new ModelAndView();
        List<Rooms> rooms = resvRepository.getList(check_in_date, check_out_date);
        mav.addObject("rooms", rooms);
        mav.setViewName("entity/search");
        return mav;
    }
}
