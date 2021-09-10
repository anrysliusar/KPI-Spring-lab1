package com.example.springlab1_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AboutUsController {

    @GetMapping("/aboutUs")
    public String getAboutUsPage(){
        return "index";

    }

}
