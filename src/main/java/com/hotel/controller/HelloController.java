package com.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/***
 * 테스트용 Controller 입니다.
 * 사이트 접속할 경우 초기화면입니다! ex) http://localhost:7080/
 * @author jangjunsoo
 */
@Controller
public class HelloController {
//    @RequestMapping(value="/", method = RequestMethod.GET)
//    public ModelAndView index() {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("entity/index");
//        mav.addObject("msg", "안녕하세요");
//
//        return mav;
//    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index2() {
        return "adminPage/reserve_page";
    }
}
