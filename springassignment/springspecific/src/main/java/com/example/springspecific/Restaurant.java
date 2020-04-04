package com.example.springspecific;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
@Autowired
private HotDrink hotdrink;

    void prepareDrink()
    {
        hotdrink.prepareDrink();



    }

}
