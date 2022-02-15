package com.hotel.controller;

import com.hotel.model.User;
import com.hotel.repository.KakaoRepository;
import com.hotel.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    KakaoRepository kakaoRepository;
    @Autowired
    LoginRepository loginRepository;
    @RequestMapping(value="", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("entity/login");
        return mav;
    }


    @ResponseBody
    @RequestMapping(value = "/kakao", method = RequestMethod.GET)
    public void kakaoCallback(@RequestParam String code, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String access_Token = kakaoRepository.getKaKaoAccessToken(code);
        String email = kakaoRepository.createKakaoUser(access_Token);

        if (email!=null && !email.equals("")) {
            User user = loginRepository.findUser(email);
            if (user == null) {
                response.sendRedirect("register");
            } else {
                request.setAttribute("user", user);
                response.sendRedirect("/");
            }
        }

    }
}
