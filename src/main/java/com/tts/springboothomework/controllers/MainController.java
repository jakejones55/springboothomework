package com.tts.springboothomework.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    //opens our site localhost:8080
    @RequestMapping("/")
    public String homepage(){
        return "Welcome!!!!";
    }

    @RequestMapping("/someOtherPlace")
    public String someOtherPlaceOutput(){
        return "some other place!";
    }

}
