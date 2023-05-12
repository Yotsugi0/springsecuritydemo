package com.example.controller;

import com.example.domain.ResponseResult;
import com.example.service.LogoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logout")
public class LogoutController {

    @Autowired
    private LogoutService logoutService;

    @GetMapping
    public ResponseResult logout(){
        return logoutService.logout();
    }
}
