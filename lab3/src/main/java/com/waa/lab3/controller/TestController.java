package com.waa.lab3.controller;

import com.waa.lab3.aspect.annotation.LogMe;
import com.waa.lab3.aspect.annotation.Timer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @LogMe
    @Timer
    @GetMapping("/test")
    public String getAll() {
        return "TEST";
    }

}
