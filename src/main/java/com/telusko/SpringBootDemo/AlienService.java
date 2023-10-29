package com.telusko.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlienService {

    @Autowired
    private AlienRepo repo;

    public void addAlien(Alien a) {
       repo.save(a);
    }

    public Alien getAlien(int aid) {
        return repo.get(aid);
    }

    public List<Alien> getAliens() {
        System.out.println("getAliens called");
        return null;
    }

}
