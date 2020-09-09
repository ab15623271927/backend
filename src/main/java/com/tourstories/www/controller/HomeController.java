package com.tourstories.www.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping(value= "/")
    public String getHome() {
        return "Welcome to tourstories.com to help your travelling ";
    }

}
