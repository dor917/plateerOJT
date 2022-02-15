package com.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/resv/**")
public class ResvController {
    @GetMapping("search")
    public ModelAndView search() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("entity/search");
        return mav;
    }
}
