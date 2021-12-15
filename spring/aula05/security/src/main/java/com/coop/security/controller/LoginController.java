package com.coop.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        model.put("name", "Demo Security");
        return "welcome";
    }


}
