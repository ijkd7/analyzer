package com.ik.demo.nativeanaylyzer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String getGreeting() {
        return "Hello world!";
    }
}
