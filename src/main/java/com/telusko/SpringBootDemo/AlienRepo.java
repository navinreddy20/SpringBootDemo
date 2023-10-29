package com.telusko.SpringBootDemo;


import org.springframework.stereotype.Component;

@Component
public class AlienRepo {
    public void save(Alien a) {

        System.out.println(a);
        System.out.println("saved to db");

    }

    public Alien get(int aid) {

        return new Alien();

    }

    // methods for crud operations for alien
}