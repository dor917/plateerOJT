package com.hotel.controller;

import com.hotel.model.User;
import com.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;



    @GetMapping(value = "/mypage")
    public ModelAndView getMyPage(User user) {

        ModelAndView mav = new ModelAndView();
        User resultUser = userRepository.findUser(user.getEmail());
        mav.addObject("user", resultUser);
        mav.setViewName("entity/user/mypage");
        return mav;
    }
}
