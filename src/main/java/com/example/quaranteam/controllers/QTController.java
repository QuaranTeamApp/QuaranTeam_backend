package com.example.quaranteam.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QTController {

    @GetMapping("/ping")
    public String testQT(){
        return "Success!";
    }

}
