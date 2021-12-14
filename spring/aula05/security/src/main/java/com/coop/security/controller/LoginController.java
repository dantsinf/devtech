package com.coop.security.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {

    @GetMapping("/")
    public String showLoginPage(ModelMap model){
        model.put("name", "in28Minutes");
        return "welcome";
    }


}
