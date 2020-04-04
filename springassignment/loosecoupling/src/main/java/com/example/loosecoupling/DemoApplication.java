package com.example.loosecoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
{

    public static void main(String[] args)
	{
        Restaurant restaurant = new Restaurant();
        restaurant.prepareDrink();
        SpringApplication.run(DemoApplication.class, args);

    }

}
