package com.waa.lab3.controller;

import com.waa.lab3.aspect.annotation.LogMe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @LogMe
    @GetMapping("/test")
    public String getAll() {
        return "TEST";
    }

}
