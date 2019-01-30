package com.rohan.springclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class IndexController {

    @Value("${lucky-word}") String luckyWord;

    @GetMapping("/luckyword")
    public String showLuckyWord() {
        return "Lucky word is " + "";
    }

}
