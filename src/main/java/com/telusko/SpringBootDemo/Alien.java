package com.telusko.SpringBootDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {

    private int aid;
    private String aname;
    private int age;

    public Alien() {
        super();
        System.out.println("Object created");
    }
    // getters and setters
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
        System.out.println("setAid called");
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
        System.out.println("setAname called");
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        System.out.println("setAge called");
    }
    // toString method
    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", age=" + age + "]";
    }

    public void show() {
        System.out.println("I rock");
    }

}
