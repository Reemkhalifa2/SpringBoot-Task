package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String welcomeMessage(){
        return "Welcome to Code Creators Spring Boot Training";
    }

    @GetMapping("/help")
    public String helpMessage(){
        return "!!!!!  I Need HELP  !!!!";
    }

    @GetMapping("/profile/data")
    public Trainee getProfile(){
        return new Trainee("Reem" , "Nafath");
    }
}
