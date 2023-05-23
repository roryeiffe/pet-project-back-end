package com.revature.springbootdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "App Works!";
    }
}
