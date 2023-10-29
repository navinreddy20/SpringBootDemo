package com.telusko.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		Alien a = context.getBean(Alien.class);
		a.setAid(101);
		a.setAname("Navin");
		a.setAge(22);


		Alien a1 = context.getBean(Alien.class);
		a1.setAid(102);
		a1.setAname("Rashi");
		a1.setAge(23);

		AlienService service = context.getBean(AlienService.class);

		service.addAlien(a);
		service.addAlien(a1);


	}

}
