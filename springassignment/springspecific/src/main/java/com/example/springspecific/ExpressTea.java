package com.example.springspecific;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExpressTea implements HotDrink
{

    @Override
    public void prepareDrink()
    {
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        System.out.println("Preparing Express Tea");
        System.out.println(">>>>>>>>>>>>>>>>>>>>");

    }
}
