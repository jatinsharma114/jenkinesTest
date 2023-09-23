package com.practice01.practicalzoon;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public String homeUrl() {
        return "Welcome to the page!!!";
    }
    

}
