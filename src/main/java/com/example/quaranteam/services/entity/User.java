package com.example.quaranteam.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    //@Setter
    //@Getter
    private String username;

    public void setUsername(String un){
        this.username = un;
    }

    // User(String username){
    //     this.username = username;
    // }

}
