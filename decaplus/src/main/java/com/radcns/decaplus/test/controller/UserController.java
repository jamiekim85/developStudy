package com.radcns.decaplus.test.controller;

import com.radcns.decaplus.test.dto.UserDTO;
import com.radcns.decaplus.test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequiredArgsConstructor
public class UserController {

    // 생성자 주입
    private final UserService userService;

    @GetMapping("/user_register")
    public String saveForm(){
        return "/user_register";
    }

    @PostMapping("/user_register")
    public String save(@ModelAttribute UserDTO userDTO){
        System.out.println("UserController.save");
        System.out.println("userDTO = " + userDTO);

        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        String dateTime = sDate.format(new Date());

        userDTO.setCreated_at(dateTime);
        userDTO.setUpdated_at(dateTime);

        userService.save(userDTO);

        return "/home";
    }
}
