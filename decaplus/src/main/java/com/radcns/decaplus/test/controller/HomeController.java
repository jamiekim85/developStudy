package com.radcns.decaplus.test.controller;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/home")
    public String home(){

        return "/home";
    }

    @GetMapping("/user/{user_id}")
    public String user(@PathVariable String user_id, Model model){

        model.addAttribute("user_id",user_id);

        return "/user";
    }
}