package com.example.WelcomeSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeToSpring
{
    @GetMapping("/welcometospring")
    public  String welcomeToSprinng()
    {
        return "Welcome To Spring";

    }



}
