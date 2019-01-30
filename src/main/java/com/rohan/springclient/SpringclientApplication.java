package com.rohan.springclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringclientApplication {

    @PostConstruct
    public void SpringclientApplication() {
        System.out.println("initial call by rohan");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringclientApplication.class, args);
    }

}

