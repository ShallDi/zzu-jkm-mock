package com.example.jkm.controller;

import com.example.jkm.dao.UserRepository;
import com.example.jkm.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class JkmMockController {

    private static final ThreadLocal<SimpleDateFormat> sdf = ThreadLocal.withInitial(() -> new SimpleDateFormat("MM月dd日 HH:mm　"));

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/code/{userCode}/{location}")
    public String getLocationCodeByUser(Model m, @PathVariable("userCode") String userCode, @PathVariable("location") String location) {
        User u = userRepository.findByCodeAndLocation(userCode, location);
        if (u == null) {
            u = new User("未知");
        }
        u.setTime(sdf.get().format(new Date()));
        m.addAttribute("u", u);
        return "index";
    }
}
