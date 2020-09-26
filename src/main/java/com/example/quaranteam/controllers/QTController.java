package com.example.quaranteam.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class QTController {

    @GetMapping("/ping")
    public String testQT(){
        return "Success!";
    }

    @GetMapping(value="/add")
    public int getMethodName(@RequestParam int x, @RequestParam int y) {
        return x+y;
    }
}
