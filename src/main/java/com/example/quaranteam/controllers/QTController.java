package com.example.quaranteam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.quaranteam.repository.UserRepository;
import com.example.quaranteam.services.entity.User;

@RestController
public class QTController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/ping")
    public String testQT(){
        return "Success!";
    }
    
    @GetMapping(value="/createuser")
    public String createUser(@RequestParam String username){
        User user = new User();
        System.out.println("bp1");
        user.setUsername(username);
        System.out.println("bp2");
        userRepository.save(user);
        System.out.println("bp3");
        return "Success";
    }
    
}
