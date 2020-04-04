package com.example.springspecific;

import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink
{

    @Override
    public void prepareDrink()
    {

        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        System.out.println("Preparing Tea");
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

    }
}
