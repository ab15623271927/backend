package com.tourstories.www.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {
    @GetMapping(value= "/")
    public String getDemoData() {
        return "Welcome to tourstories.com";
    }

}
